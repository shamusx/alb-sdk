// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPReselectRespCode HTTP reselect resp code
// swagger:model HTTPReselectRespCode
type HTTPReselectRespCode struct {

	// HTTP response code to be matched. Allowed values are 400-599.
	Codes []int64 `json:"codes,omitempty,omitempty"`

	// HTTP response code ranges to match.
	Ranges []*HttpstatusRange `json:"ranges,omitempty"`

	// Block of HTTP response codes to match for server reselect. Enum options - HTTP_RSP_4XX, HTTP_RSP_5XX.
	RespCodeBlock []string `json:"resp_code_block,omitempty"`
}
