// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4Policies l4 policies
// swagger:model L4Policies
type L4Policies struct {

	// Index of the virtual service L4 policy set. Field introduced in 17.2.7. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Index *int32 `json:"index"`

	// ID of the virtual service L4 policy set. It is a reference to an object of type L4PolicySet. Field introduced in 17.2.7. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	L4PolicySetRef *string `json:"l4_policy_set_ref"`
}
