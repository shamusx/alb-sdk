// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MethodMatch method match
// swagger:model MethodMatch
type MethodMatch struct {

	// Criterion to use for HTTP method matching the method in the HTTP request. Enum options - IS_IN, IS_NOT_IN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	MatchCriteria *string `json:"match_criteria"`

	// Configure HTTP method(s). Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Minimum of 1 items required. Maximum of 16 items allowed. Allowed in Enterprise with any value edition, Essentials(Allowed values- HTTP_METHOD_GET,HTTP_METHOD_PUT,HTTP_METHOD_POST,HTTP_METHOD_HEAD,HTTP_METHOD_OPTIONS) edition, Basic(Allowed values- HTTP_METHOD_GET,HTTP_METHOD_PUT,HTTP_METHOD_POST,HTTP_METHOD_HEAD,HTTP_METHOD_OPTIONS) edition, Enterprise with Cloud Services edition.
	Methods []string `json:"methods,omitempty"`
}
