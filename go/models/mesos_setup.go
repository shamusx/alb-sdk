// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MesosSetup mesos setup
// swagger:model MesosSetup
type MesosSetup struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FailedHosts []string `json:"failed_hosts,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FleetEndpoint *string `json:"fleet_endpoint,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Hosts []string `json:"hosts,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MesosAccess *bool `json:"mesos_access,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MesosURL *string `json:"mesos_url,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MissingHosts []string `json:"missing_hosts,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NewHosts []string `json:"new_hosts,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDeployMethodAccess *bool `json:"se_deploy_method_access,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
