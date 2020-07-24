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
 * SEFaultInjectSeParam
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SEFaultInjectSeParam {
  @JsonProperty("core")
  private Integer core = 1000;

  @JsonProperty("random_core")
  private Boolean randomCore = null;

  @JsonProperty("se_agent_fault")
  private String seAgentFault = "SE_AGENT_FAULT_DISABLED";

  @JsonProperty("se_dp_fault")
  private String seDpFault = "SE_DP_FAULT_DISABLED";

  public SEFaultInjectSeParam core(Integer core) {
    this.core = core;
    return this;
  }

   /**
   * Inject fault in specific core. Field introduced in 18.1.5,18.2.1.
   * @return core
  **/
  @Schema(description = "Inject fault in specific core. Field introduced in 18.1.5,18.2.1.")
  public Integer getCore() {
    return core;
  }

  public void setCore(Integer core) {
    this.core = core;
  }

  public SEFaultInjectSeParam randomCore(Boolean randomCore) {
    this.randomCore = randomCore;
    return this;
  }

   /**
   * Inject fault in random no of cores. Field introduced in 18.1.5,18.2.1.
   * @return randomCore
  **/
  @Schema(description = "Inject fault in random no of cores. Field introduced in 18.1.5,18.2.1.")
  public Boolean isRandomCore() {
    return randomCore;
  }

  public void setRandomCore(Boolean randomCore) {
    this.randomCore = randomCore;
  }

  public SEFaultInjectSeParam seAgentFault(String seAgentFault) {
    this.seAgentFault = seAgentFault;
    return this;
  }

   /**
   * Set se-agent fault type. Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT, SE_AGENT_RANDOM_PROCESS_FAULT. Field introduced in 18.1.5,18.2.1.
   * @return seAgentFault
  **/
  @Schema(description = "Set se-agent fault type. Enum options - SE_AGENT_FAULT_DISABLED, SE_AGENT_PRE_PROCESS_FAULT, SE_AGENT_POST_PROCESS_FAULT, SE_AGENT_DP_RESPONSE_FAULT, SE_AGENT_RANDOM_PROCESS_FAULT. Field introduced in 18.1.5,18.2.1.")
  public String getSeAgentFault() {
    return seAgentFault;
  }

  public void setSeAgentFault(String seAgentFault) {
    this.seAgentFault = seAgentFault;
  }

  public SEFaultInjectSeParam seDpFault(String seDpFault) {
    this.seDpFault = seDpFault;
    return this;
  }

   /**
   * Set se-dp fault type. Enum options - SE_DP_FAULT_DISABLED. Field introduced in 18.1.5,18.2.1.
   * @return seDpFault
  **/
  @Schema(description = "Set se-dp fault type. Enum options - SE_DP_FAULT_DISABLED. Field introduced in 18.1.5,18.2.1.")
  public String getSeDpFault() {
    return seDpFault;
  }

  public void setSeDpFault(String seDpFault) {
    this.seDpFault = seDpFault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEFaultInjectSeParam seFaultInjectSeParam = (SEFaultInjectSeParam) o;
    return Objects.equals(this.core, seFaultInjectSeParam.core) &&
        Objects.equals(this.randomCore, seFaultInjectSeParam.randomCore) &&
        Objects.equals(this.seAgentFault, seFaultInjectSeParam.seAgentFault) &&
        Objects.equals(this.seDpFault, seFaultInjectSeParam.seDpFault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(core, randomCore, seAgentFault, seDpFault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEFaultInjectSeParam {\n");
    
    sb.append("    core: ").append(toIndentedString(core)).append("\n");
    sb.append("    randomCore: ").append(toIndentedString(randomCore)).append("\n");
    sb.append("    seAgentFault: ").append(toIndentedString(seAgentFault)).append("\n");
    sb.append("    seDpFault: ").append(toIndentedString(seDpFault)).append("\n");
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