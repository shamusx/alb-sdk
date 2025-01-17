// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VNICNetwork v n i c network
// swagger:model vNICNetwork
type VNICNetwork struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CtlrAlloc *bool `json:"ctlr_alloc,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddrPrefix `json:"ip"`

	//  Enum options - DHCP, STATIC, VIP, DOCKER_HOST. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Mode *string `json:"mode"`
}
