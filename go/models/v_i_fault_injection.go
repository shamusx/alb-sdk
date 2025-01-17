// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIFaultInjection v i fault injection
// swagger:model VIFaultInjection
type VIFaultInjection struct {

	//  Enum options - INITIAL_VALUE, CREATE_SE, MODIFY_VNIC, VM_MONITOR, RESOURCE_MONITOR, PERF_MONITOR, SET_MGMT_IP, MODIFY_MGMT_IP, SIM_VM_BULK_NOTIF, RESYNC_ERROR, SIMULATE_OVA_ERR, VCENTER_NO_OBJECTS, CREATE_VM_RUNTIME_ERR, VERSION_NULL_ERR, INVALID_LOGIN, DISC_PGNAME_ERR, DISC_DCDETAILS_ERR, DISC_DC_ERR, DISC_HOST_ERR, DISC_CLUSTER_ERR, DISC_PG_ERR, DISC_VM_ERR, HOST_PWR_STATE_ERR, HOST_CONN_STATE_ERR, HOST_MM_ERR, HOST_QUARANTINED_ERR, HOST_CTLR_ACCESS_ERR, HOST_NO_MGMT_ERR, HOST_NO_CPU_ERR, HOST_NO_MEM_ERR, HOST_NO_DISK_ERR, CREATE_SE_VIMGR, DELETE_SE_VIMGR, SLOW_VCENTER_ACCESS, CLEAR_ALL_FAULTS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	API *string `json:"api"`

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Count *int32 `json:"count"`

	//  Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NetworkUUID *string `json:"network_uuid,omitempty"`

	//  Enum options - SEVM_SUCCESS, SEVM_CREATE_FAIL_NO_HW_INFO, SEVM_CREATE_FAIL_DUPLICATE_NAME, SEVM_CREATE_FAIL_NO_MGMT_NW, SEVM_CREATE_FAIL_NO_CPU, SEVM_CREATE_FAIL_NO_MEM, SEVM_CREATE_FAIL_NO_LEASE, SEVM_CREATE_FAIL_OVF_ERROR, SEVM_CREATE_NO_HOST_VM_NETWORK, SEVM_CREATE_FAIL_NO_PROGRESS, SEVM_CREATE_FAIL_ABORTED, SEVM_CREATE_FAILURE, SEVM_CREATE_FAIL_POWER_ON, SEVM_VNIC_NO_VM, SEVM_VNIC_MAC_ADDR_ERROR, SEVM_VNIC_FAILURE, SEVM_VNIC_NO_PG_PORTS, SEVM_DELETE_FAILURE, SEVM_CREATE_LIMIT_REACHED, SEVM_SET_MGMT_IP_FAILED, SEVM_CREATE_ACCESS_ERROR, SEVM_CREATE_NO_IMAGE, SEVM_VINFRA_UNINITIALIZED, SEVM_CREATE_NO_HOST, SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SEVM_INVALID_DATA, SEVM_VCENTER_CONN_FAIL, SEVM_TIMED_OUT, SEVM_NO_SOURCE_CLONE, SEVM_NO_AVAILABILITY_ZONE, SEVM_FLAVOR_UNAVAIL, SEVM_DELETED, SEVM_VINFRA_FAILURE, SEVM_VNIC_FAILURE_QUESTION, SEVM_VNIC_NO_IPS_AVAILABLE, SEVM_NO_MGMT_IP_AVAILABLE, AUTHENTICATION_FAILURE. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`
}
