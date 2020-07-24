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
import com.vmware.avi.sdk.model.RateProfile;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * RateLimiterProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class RateLimiterProfile {
  @JsonProperty("client_ip_connections_rate_limit")
  private RateProfile clientIpConnectionsRateLimit = null;

  @JsonProperty("client_ip_failed_requests_rate_limit")
  private RateProfile clientIpFailedRequestsRateLimit = null;

  @JsonProperty("client_ip_requests_rate_limit")
  private RateProfile clientIpRequestsRateLimit = null;

  @JsonProperty("client_ip_scanners_requests_rate_limit")
  private RateProfile clientIpScannersRequestsRateLimit = null;

  @JsonProperty("client_ip_to_uri_failed_requests_rate_limit")
  private RateProfile clientIpToUriFailedRequestsRateLimit = null;

  @JsonProperty("client_ip_to_uri_requests_rate_limit")
  private RateProfile clientIpToUriRequestsRateLimit = null;

  @JsonProperty("custom_requests_rate_limit")
  private RateProfile customRequestsRateLimit = null;

  @JsonProperty("http_header_rate_limits")
  private List<RateProfile> httpHeaderRateLimits = null;

  @JsonProperty("uri_failed_requests_rate_limit")
  private RateProfile uriFailedRequestsRateLimit = null;

  @JsonProperty("uri_requests_rate_limit")
  private RateProfile uriRequestsRateLimit = null;

  @JsonProperty("uri_scanners_requests_rate_limit")
  private RateProfile uriScannersRequestsRateLimit = null;

  public RateLimiterProfile clientIpConnectionsRateLimit(RateProfile clientIpConnectionsRateLimit) {
    this.clientIpConnectionsRateLimit = clientIpConnectionsRateLimit;
    return this;
  }

   /**
   * Get clientIpConnectionsRateLimit
   * @return clientIpConnectionsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpConnectionsRateLimit() {
    return clientIpConnectionsRateLimit;
  }

  public void setClientIpConnectionsRateLimit(RateProfile clientIpConnectionsRateLimit) {
    this.clientIpConnectionsRateLimit = clientIpConnectionsRateLimit;
  }

  public RateLimiterProfile clientIpFailedRequestsRateLimit(RateProfile clientIpFailedRequestsRateLimit) {
    this.clientIpFailedRequestsRateLimit = clientIpFailedRequestsRateLimit;
    return this;
  }

   /**
   * Get clientIpFailedRequestsRateLimit
   * @return clientIpFailedRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpFailedRequestsRateLimit() {
    return clientIpFailedRequestsRateLimit;
  }

  public void setClientIpFailedRequestsRateLimit(RateProfile clientIpFailedRequestsRateLimit) {
    this.clientIpFailedRequestsRateLimit = clientIpFailedRequestsRateLimit;
  }

  public RateLimiterProfile clientIpRequestsRateLimit(RateProfile clientIpRequestsRateLimit) {
    this.clientIpRequestsRateLimit = clientIpRequestsRateLimit;
    return this;
  }

   /**
   * Get clientIpRequestsRateLimit
   * @return clientIpRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpRequestsRateLimit() {
    return clientIpRequestsRateLimit;
  }

  public void setClientIpRequestsRateLimit(RateProfile clientIpRequestsRateLimit) {
    this.clientIpRequestsRateLimit = clientIpRequestsRateLimit;
  }

  public RateLimiterProfile clientIpScannersRequestsRateLimit(RateProfile clientIpScannersRequestsRateLimit) {
    this.clientIpScannersRequestsRateLimit = clientIpScannersRequestsRateLimit;
    return this;
  }

   /**
   * Get clientIpScannersRequestsRateLimit
   * @return clientIpScannersRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpScannersRequestsRateLimit() {
    return clientIpScannersRequestsRateLimit;
  }

  public void setClientIpScannersRequestsRateLimit(RateProfile clientIpScannersRequestsRateLimit) {
    this.clientIpScannersRequestsRateLimit = clientIpScannersRequestsRateLimit;
  }

  public RateLimiterProfile clientIpToUriFailedRequestsRateLimit(RateProfile clientIpToUriFailedRequestsRateLimit) {
    this.clientIpToUriFailedRequestsRateLimit = clientIpToUriFailedRequestsRateLimit;
    return this;
  }

   /**
   * Get clientIpToUriFailedRequestsRateLimit
   * @return clientIpToUriFailedRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpToUriFailedRequestsRateLimit() {
    return clientIpToUriFailedRequestsRateLimit;
  }

  public void setClientIpToUriFailedRequestsRateLimit(RateProfile clientIpToUriFailedRequestsRateLimit) {
    this.clientIpToUriFailedRequestsRateLimit = clientIpToUriFailedRequestsRateLimit;
  }

  public RateLimiterProfile clientIpToUriRequestsRateLimit(RateProfile clientIpToUriRequestsRateLimit) {
    this.clientIpToUriRequestsRateLimit = clientIpToUriRequestsRateLimit;
    return this;
  }

   /**
   * Get clientIpToUriRequestsRateLimit
   * @return clientIpToUriRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getClientIpToUriRequestsRateLimit() {
    return clientIpToUriRequestsRateLimit;
  }

  public void setClientIpToUriRequestsRateLimit(RateProfile clientIpToUriRequestsRateLimit) {
    this.clientIpToUriRequestsRateLimit = clientIpToUriRequestsRateLimit;
  }

  public RateLimiterProfile customRequestsRateLimit(RateProfile customRequestsRateLimit) {
    this.customRequestsRateLimit = customRequestsRateLimit;
    return this;
  }

   /**
   * Get customRequestsRateLimit
   * @return customRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getCustomRequestsRateLimit() {
    return customRequestsRateLimit;
  }

  public void setCustomRequestsRateLimit(RateProfile customRequestsRateLimit) {
    this.customRequestsRateLimit = customRequestsRateLimit;
  }

  public RateLimiterProfile httpHeaderRateLimits(List<RateProfile> httpHeaderRateLimits) {
    this.httpHeaderRateLimits = httpHeaderRateLimits;
    return this;
  }

  public RateLimiterProfile addHttpHeaderRateLimitsItem(RateProfile httpHeaderRateLimitsItem) {
    if (this.httpHeaderRateLimits == null) {
      this.httpHeaderRateLimits = new ArrayList<RateProfile>();
    }
    this.httpHeaderRateLimits.add(httpHeaderRateLimitsItem);
    return this;
  }

   /**
   * Rate Limit all HTTP requests from all client IP addresses that contain any single HTTP header value. Field introduced in 17.1.1.
   * @return httpHeaderRateLimits
  **/
  @Schema(description = "Rate Limit all HTTP requests from all client IP addresses that contain any single HTTP header value. Field introduced in 17.1.1.")
  public List<RateProfile> getHttpHeaderRateLimits() {
    return httpHeaderRateLimits;
  }

  public void setHttpHeaderRateLimits(List<RateProfile> httpHeaderRateLimits) {
    this.httpHeaderRateLimits = httpHeaderRateLimits;
  }

  public RateLimiterProfile uriFailedRequestsRateLimit(RateProfile uriFailedRequestsRateLimit) {
    this.uriFailedRequestsRateLimit = uriFailedRequestsRateLimit;
    return this;
  }

   /**
   * Get uriFailedRequestsRateLimit
   * @return uriFailedRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getUriFailedRequestsRateLimit() {
    return uriFailedRequestsRateLimit;
  }

  public void setUriFailedRequestsRateLimit(RateProfile uriFailedRequestsRateLimit) {
    this.uriFailedRequestsRateLimit = uriFailedRequestsRateLimit;
  }

  public RateLimiterProfile uriRequestsRateLimit(RateProfile uriRequestsRateLimit) {
    this.uriRequestsRateLimit = uriRequestsRateLimit;
    return this;
  }

   /**
   * Get uriRequestsRateLimit
   * @return uriRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getUriRequestsRateLimit() {
    return uriRequestsRateLimit;
  }

  public void setUriRequestsRateLimit(RateProfile uriRequestsRateLimit) {
    this.uriRequestsRateLimit = uriRequestsRateLimit;
  }

  public RateLimiterProfile uriScannersRequestsRateLimit(RateProfile uriScannersRequestsRateLimit) {
    this.uriScannersRequestsRateLimit = uriScannersRequestsRateLimit;
    return this;
  }

   /**
   * Get uriScannersRequestsRateLimit
   * @return uriScannersRequestsRateLimit
  **/
  @Schema(description = "")
  public RateProfile getUriScannersRequestsRateLimit() {
    return uriScannersRequestsRateLimit;
  }

  public void setUriScannersRequestsRateLimit(RateProfile uriScannersRequestsRateLimit) {
    this.uriScannersRequestsRateLimit = uriScannersRequestsRateLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLimiterProfile rateLimiterProfile = (RateLimiterProfile) o;
    return Objects.equals(this.clientIpConnectionsRateLimit, rateLimiterProfile.clientIpConnectionsRateLimit) &&
        Objects.equals(this.clientIpFailedRequestsRateLimit, rateLimiterProfile.clientIpFailedRequestsRateLimit) &&
        Objects.equals(this.clientIpRequestsRateLimit, rateLimiterProfile.clientIpRequestsRateLimit) &&
        Objects.equals(this.clientIpScannersRequestsRateLimit, rateLimiterProfile.clientIpScannersRequestsRateLimit) &&
        Objects.equals(this.clientIpToUriFailedRequestsRateLimit, rateLimiterProfile.clientIpToUriFailedRequestsRateLimit) &&
        Objects.equals(this.clientIpToUriRequestsRateLimit, rateLimiterProfile.clientIpToUriRequestsRateLimit) &&
        Objects.equals(this.customRequestsRateLimit, rateLimiterProfile.customRequestsRateLimit) &&
        Objects.equals(this.httpHeaderRateLimits, rateLimiterProfile.httpHeaderRateLimits) &&
        Objects.equals(this.uriFailedRequestsRateLimit, rateLimiterProfile.uriFailedRequestsRateLimit) &&
        Objects.equals(this.uriRequestsRateLimit, rateLimiterProfile.uriRequestsRateLimit) &&
        Objects.equals(this.uriScannersRequestsRateLimit, rateLimiterProfile.uriScannersRequestsRateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIpConnectionsRateLimit, clientIpFailedRequestsRateLimit, clientIpRequestsRateLimit, clientIpScannersRequestsRateLimit, clientIpToUriFailedRequestsRateLimit, clientIpToUriRequestsRateLimit, customRequestsRateLimit, httpHeaderRateLimits, uriFailedRequestsRateLimit, uriRequestsRateLimit, uriScannersRequestsRateLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLimiterProfile {\n");
    
    sb.append("    clientIpConnectionsRateLimit: ").append(toIndentedString(clientIpConnectionsRateLimit)).append("\n");
    sb.append("    clientIpFailedRequestsRateLimit: ").append(toIndentedString(clientIpFailedRequestsRateLimit)).append("\n");
    sb.append("    clientIpRequestsRateLimit: ").append(toIndentedString(clientIpRequestsRateLimit)).append("\n");
    sb.append("    clientIpScannersRequestsRateLimit: ").append(toIndentedString(clientIpScannersRequestsRateLimit)).append("\n");
    sb.append("    clientIpToUriFailedRequestsRateLimit: ").append(toIndentedString(clientIpToUriFailedRequestsRateLimit)).append("\n");
    sb.append("    clientIpToUriRequestsRateLimit: ").append(toIndentedString(clientIpToUriRequestsRateLimit)).append("\n");
    sb.append("    customRequestsRateLimit: ").append(toIndentedString(customRequestsRateLimit)).append("\n");
    sb.append("    httpHeaderRateLimits: ").append(toIndentedString(httpHeaderRateLimits)).append("\n");
    sb.append("    uriFailedRequestsRateLimit: ").append(toIndentedString(uriFailedRequestsRateLimit)).append("\n");
    sb.append("    uriRequestsRateLimit: ").append(toIndentedString(uriRequestsRateLimit)).append("\n");
    sb.append("    uriScannersRequestsRateLimit: ").append(toIndentedString(uriScannersRequestsRateLimit)).append("\n");
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