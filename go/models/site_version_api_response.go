// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SiteVersionAPIResponse site version Api response
// swagger:model SiteVersionApiResponse
type SiteVersionAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*SiteVersion `json:"results,omitempty"`
}
