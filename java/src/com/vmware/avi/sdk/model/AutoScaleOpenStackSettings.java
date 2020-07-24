/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AutoScaleOpenStackSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AutoScaleOpenStackSettings {
  @JsonProperty("heat_scale_down_url")
  private String heatScaleDownUrl = null;

  @JsonProperty("heat_scale_up_url")
  private String heatScaleUpUrl = null;

  public AutoScaleOpenStackSettings heatScaleDownUrl(String heatScaleDownUrl) {
    this.heatScaleDownUrl = heatScaleDownUrl;
    return this;
  }

   /**
   * Avi Controller will use this URL to scale downthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.
   * @return heatScaleDownUrl
  **/
  @Schema(description = "Avi Controller will use this URL to scale downthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.")
  public String getHeatScaleDownUrl() {
    return heatScaleDownUrl;
  }

  public void setHeatScaleDownUrl(String heatScaleDownUrl) {
    this.heatScaleDownUrl = heatScaleDownUrl;
  }

  public AutoScaleOpenStackSettings heatScaleUpUrl(String heatScaleUpUrl) {
    this.heatScaleUpUrl = heatScaleUpUrl;
    return this;
  }

   /**
   * Avi Controller will use this URL to scale upthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.
   * @return heatScaleUpUrl
  **/
  @Schema(description = "Avi Controller will use this URL to scale upthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.")
  public String getHeatScaleUpUrl() {
    return heatScaleUpUrl;
  }

  public void setHeatScaleUpUrl(String heatScaleUpUrl) {
    this.heatScaleUpUrl = heatScaleUpUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleOpenStackSettings autoScaleOpenStackSettings = (AutoScaleOpenStackSettings) o;
    return Objects.equals(this.heatScaleDownUrl, autoScaleOpenStackSettings.heatScaleDownUrl) &&
        Objects.equals(this.heatScaleUpUrl, autoScaleOpenStackSettings.heatScaleUpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heatScaleDownUrl, heatScaleUpUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleOpenStackSettings {\n");
    
    sb.append("    heatScaleDownUrl: ").append(toIndentedString(heatScaleDownUrl)).append("\n");
    sb.append("    heatScaleUpUrl: ").append(toIndentedString(heatScaleUpUrl)).append("\n");
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