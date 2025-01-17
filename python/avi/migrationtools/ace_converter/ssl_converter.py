# Copyright 2021 VMware, Inc.
# SPDX-License-Identifier: Apache License 2.0

""" SSL Conversion Goes here """
import os
import logging
from avi.migrationtools.ace_converter.ace_constants import\
    DEFAULT_FAILED_CHECKS, DEFAULT_INTERVAL, DEFAULT_TIMEOUT, PLACE_HOLDER_STR
from avi.migrationtools.ace_converter.ace_utils import update_excel, get_loc

# logging init
LOG = logging.getLogger(__name__)


class SSLConverter(object):
    """ SSL Converter Class """

    def __init__(self, parsed, tenant_ref, common_utils, in_path, tenant):
        self.parsed = parsed
        self.tenant_ref = tenant_ref
        self.common_utils = common_utils
        self.tenant = tenant
        if in_path:
            self.in_path = in_path
        else:
            ''' if the in_path is not given the current location is considered
                to check the key and cert files
            '''
            self.in_path = get_loc()

    def get_key_cert_obj(self, name, key_file_name, cert_file_name, input_dir):
        """
        :param name:name of ssl cert.
        :param key_file_name:  key file (ie.pem)
        :param cert_file_name: certificate file name
        :param input_dir: input directory for certificate file name
        :return: returns dict of ssl object
        """
        folder_path = input_dir + os.path.sep
        key = self.common_utils.upload_file(folder_path + key_file_name)
        cert = self.common_utils.upload_file(folder_path + cert_file_name)
        ssl_kc_obj = None
        if key and cert:
            cert = {"certificate": cert.decode()}
            ssl_kc_obj = {
                'name': name,
                'key': key.decode(),
                'certificate': cert,
                'key_passphrase': ''
            }
        return ssl_kc_obj

    def ssl_key_and_cert(self):
        key_list = list()
        for ssl in self.parsed.get('ssl-proxy', ''):
            key = None
            cert = None
            key_loc = None
            cert_loc = None
            name = ssl['name']
            key_and_cert = None
            for val in ssl['desc']:
                if val.get('key', ''):
                    key_file = val['key']
                    key_loc = '%s/%s' % (self.in_path, val['key'])
                if val.get('cert', ''):
                    cert_file = val['cert']
                    cert_loc = '%s/%s' % (self.in_path, val['cert'])
                    if not os.path.isfile(cert_loc):
                        cert_loc = None
            if key_loc and cert_loc:
                key_and_cert = self.get_key_cert_obj(name, key_file, cert_file,
                                                     self.in_path)
            else:
                key, cert = self.common_utils.create_self_signed_cert()
            if key and cert and name:
                key_and_cert = {
                    "type": "SSL_CERTIFICATE_TYPE_VIRTUALSERVICE",
                    "certificate": {
                        "certificate": cert
                    },
                    "tenant_ref": self.tenant_ref,
                    "name": "%s-%s" % (name, PLACE_HOLDER_STR),
                    "key": key
                }
            if key_and_cert:
                key_list.append(key_and_cert)
                update_excel('ssl-proxy', name, avi_obj=key_list)
        return key_list

    def ssl_profile(self):
        """ Create SSL Profiles """
        ssl_profile_list = list()
        ssl_ciphers = None
        ciphers_enums = list()
        # print self.parsed['parameter-map']
        # print "=========================="
        # print self.parsed['ssl-proxy']
        for ssl in self.parsed.get('ssl-proxy', ''):
            for desc in ssl['desc']:
                ssl_ciphers = desc.get('ssl')
            temp_ssl_profile = dict()
            temp_ssl_profile = {
                "accepted_ciphers": "DEFAULT:+SHA:+3DES:+kEDH",
                "name": ssl['name'],
                "accepted_versions": [
                    {
                        "type": "SSL_VERSION_TLS1"
                    },
                    {
                        "type": "SSL_VERSION_TLS1_1"
                    },
                    {
                        "type": "SSL_VERSION_TLS1_2"
                    }
                ],
                "tenant_ref": self.tenant_ref,
                "send_close_notify": False
            }
            if ssl_ciphers:
                temp_ssl_profile.update({'cipher_enums': ciphers_enums})
            ssl_profile_list.append(temp_ssl_profile)
        return ssl_profile_list

    def get_cert_obj(self, name, cert_file_name, input_dir):
        """
        :param name:name of ssl cert.
        :param cert_file_name: certificate file name
        :param input_dir: input directory for certificate file name
        :return: returns dict of ssl object
        """
        folder_path = input_dir + os.path.sep
        cert = self.upload_file(folder_path + cert_file_name)
        ssl_c_obj = None
        if cert:
            ssl_c_obj = {
                'certificate': cert,
            }
        return ssl_c_obj

    def crypto_chaingroup(self):

        """Add Root/Intermediate certificates to SSLKeyAndCertificates Object.
        :return: Certificate list for type CA.
        """

        chaingroup_list = list()
        crypto_obj = self.parsed.get('crypto', '')
        #name = crypto[0]['chaingroup']
        certificate_list = list()
        if not crypto_obj:
            return certificate_list
        certs = crypto_obj[0].get('cert', [])
        for cert_name in certs:
            ssl_c_obj = None
            cert = None
            ca_cert = None
            name = cert_name.split('.')[0]
            key_and_cert = None
            cert_file = cert_name
            cert_loc = '%s/%s' % (self.in_path, cert_name)
            if not os.path.isfile(cert_loc):
                cert_loc = None
            if cert_loc:
                cert = self.get_cert_obj(name, cert_file, self.in_path)
            if cert and name:
                ca_cert = {
                    "type": "SSL_CERTIFICATE_TYPE_CA",
                    "certificate": cert,
                    "tenant_ref": self.tenant_ref,
                    "name": name,
                }
            if ca_cert:
                certificate_list.append(ca_cert)
        for obj in crypto_obj:
            if obj.has_key("chaingroup"):
                name = obj["chaingroup"]
            if obj.has_key("csr-params"):
                name = obj["csr-params"]
            update_excel('crypto', name, avi_obj=obj)

        return certificate_list
        