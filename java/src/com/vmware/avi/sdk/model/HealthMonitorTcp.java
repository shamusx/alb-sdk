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
 * HealthMonitorTcp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class HealthMonitorTcp {
  @JsonProperty("maintenance_response")
  private String maintenanceResponse = null;

  @JsonProperty("tcp_half_open")
  private Boolean tcpHalfOpen = null;

  @JsonProperty("tcp_request")
  private String tcpRequest = null;

  @JsonProperty("tcp_response")
  private String tcpResponse = null;

  public HealthMonitorTcp maintenanceResponse(String maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
    return this;
  }

   /**
   * Match or look for this keyword in the first 2KB of server&#x27;s response indicating server maintenance.  A successful match results in the server being marked down.
   * @return maintenanceResponse
  **/
  @Schema(description = "Match or look for this keyword in the first 2KB of server's response indicating server maintenance.  A successful match results in the server being marked down.")
  public String getMaintenanceResponse() {
    return maintenanceResponse;
  }

  public void setMaintenanceResponse(String maintenanceResponse) {
    this.maintenanceResponse = maintenanceResponse;
  }

  public HealthMonitorTcp tcpHalfOpen(Boolean tcpHalfOpen) {
    this.tcpHalfOpen = tcpHalfOpen;
    return this;
  }

   /**
   * Configure TCP health monitor to use half-open TCP connections to monitor the health of backend servers thereby avoiding consumption of a full fledged server side connection and the overhead and logs associated with it.  This method is light-weight as it makes use of listener in server&#x27;s kernel layer to measure the health and a child socket or user thread is not created on the server side.
   * @return tcpHalfOpen
  **/
  @Schema(description = "Configure TCP health monitor to use half-open TCP connections to monitor the health of backend servers thereby avoiding consumption of a full fledged server side connection and the overhead and logs associated with it.  This method is light-weight as it makes use of listener in server's kernel layer to measure the health and a child socket or user thread is not created on the server side.")
  public Boolean isTcpHalfOpen() {
    return tcpHalfOpen;
  }

  public void setTcpHalfOpen(Boolean tcpHalfOpen) {
    this.tcpHalfOpen = tcpHalfOpen;
  }

  public HealthMonitorTcp tcpRequest(String tcpRequest) {
    this.tcpRequest = tcpRequest;
    return this;
  }

   /**
   * Request data to send after completing the TCP handshake.
   * @return tcpRequest
  **/
  @Schema(description = "Request data to send after completing the TCP handshake.")
  public String getTcpRequest() {
    return tcpRequest;
  }

  public void setTcpRequest(String tcpRequest) {
    this.tcpRequest = tcpRequest;
  }

  public HealthMonitorTcp tcpResponse(String tcpResponse) {
    this.tcpResponse = tcpResponse;
    return this;
  }

   /**
   * Match for the desired keyword in the first 2Kb of the server&#x27;s TCP response. If this field is left blank, no server response is required.
   * @return tcpResponse
  **/
  @Schema(description = "Match for the desired keyword in the first 2Kb of the server's TCP response. If this field is left blank, no server response is required.")
  public String getTcpResponse() {
    return tcpResponse;
  }

  public void setTcpResponse(String tcpResponse) {
    this.tcpResponse = tcpResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorTcp healthMonitorTcp = (HealthMonitorTcp) o;
    return Objects.equals(this.maintenanceResponse, healthMonitorTcp.maintenanceResponse) &&
        Objects.equals(this.tcpHalfOpen, healthMonitorTcp.tcpHalfOpen) &&
        Objects.equals(this.tcpRequest, healthMonitorTcp.tcpRequest) &&
        Objects.equals(this.tcpResponse, healthMonitorTcp.tcpResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceResponse, tcpHalfOpen, tcpRequest, tcpResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorTcp {\n");
    
    sb.append("    maintenanceResponse: ").append(toIndentedString(maintenanceResponse)).append("\n");
    sb.append("    tcpHalfOpen: ").append(toIndentedString(tcpHalfOpen)).append("\n");
    sb.append("    tcpRequest: ").append(toIndentedString(tcpRequest)).append("\n");
    sb.append("    tcpResponse: ").append(toIndentedString(tcpResponse)).append("\n");
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