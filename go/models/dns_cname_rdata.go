// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSCnameRdata Dns cname rdata
// swagger:model DnsCnameRdata
type DNSCnameRdata struct {

	// Canonical name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Cname *string `json:"cname"`
}
