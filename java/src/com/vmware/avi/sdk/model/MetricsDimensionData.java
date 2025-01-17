/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The MetricsDimensionData is a POJO class extends AviRestResource that used for creating
 * MetricsDimensionData.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsDimensionData  {
    @JsonProperty("dimension")
    private String dimension = null;

    @JsonProperty("dimension_id")
    private String dimensionId = null;



    /**
     * This is the getter method this will return the attribute value.
     * Dimension type.
     * Enum options - METRICS_DIMENSION_METRIC_TIMESTAMP, METRICS_DIMENSION_COUNTRY, METRICS_DIMENSION_OS, METRICS_DIMENSION_URL,
     * METRICS_DIMENSION_DEVTYPE, METRICS_DIMENSION_LANG, METRICS_DIMENSION_BROWSER, METRICS_DIMENSION_IPGROUP, METRICS_DIMENSION_ATTACK,
     * METRICS_DIMENSION_ASN.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * This is the setter method to the attribute.
     * Dimension type.
     * Enum options - METRICS_DIMENSION_METRIC_TIMESTAMP, METRICS_DIMENSION_COUNTRY, METRICS_DIMENSION_OS, METRICS_DIMENSION_URL,
     * METRICS_DIMENSION_DEVTYPE, METRICS_DIMENSION_LANG, METRICS_DIMENSION_BROWSER, METRICS_DIMENSION_IPGROUP, METRICS_DIMENSION_ATTACK,
     * METRICS_DIMENSION_ASN.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dimension set the dimension.
     */
    public void setDimension(String  dimension) {
        this.dimension = dimension;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dimension id.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dimensionId
     */
    public String getDimensionId() {
        return dimensionId;
    }

    /**
     * This is the setter method to the attribute.
     * Dimension id.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dimensionId set the dimensionId.
     */
    public void setDimensionId(String  dimensionId) {
        this.dimensionId = dimensionId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsDimensionData objMetricsDimensionData = (MetricsDimensionData) o;
      return   Objects.equals(this.dimension, objMetricsDimensionData.dimension)&&
  Objects.equals(this.dimensionId, objMetricsDimensionData.dimensionId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsDimensionData {\n");
                  sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
                        sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
