// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceMatch service match
// swagger:model ServiceMatch
type ServiceMatch struct {

	// Destination Port of the packet. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DestinationPort *PortMatch `json:"destination_port,omitempty"`

	// Protocol to match. Supported protocols are TCP, UDP and ICMP. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Protocol *L4RuleProtocolMatch `json:"protocol,omitempty"`

	// Source Port of the packet. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SourcePort *PortMatch `json:"source_port,omitempty"`
}
