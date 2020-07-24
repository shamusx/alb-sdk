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
import com.vmware.avi.sdk.model.GCPNetworkConfig;
import com.vmware.avi.sdk.model.GCPVIPAllocation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * GCPConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GCPConfiguration {
  @JsonProperty("cloud_credentials_ref")
  private String cloudCredentialsRef = null;

  @JsonProperty("encryption_key_id")
  private String encryptionKeyId = null;

  @JsonProperty("firewall_target_tags")
  private List<String> firewallTargetTags = null;

  @JsonProperty("gcs_bucket_name")
  private String gcsBucketName = null;

  @JsonProperty("gcs_project_id")
  private String gcsProjectId = null;

  @JsonProperty("match_se_group_subnet")
  private Boolean matchSeGroupSubnet = null;

  @JsonProperty("network_config")
  private GCPNetworkConfig networkConfig = null;

  @JsonProperty("region_name")
  private String regionName = null;

  @JsonProperty("se_project_id")
  private String seProjectId = null;

  @JsonProperty("vip_allocation_strategy")
  private GCPVIPAllocation vipAllocationStrategy = null;

  @JsonProperty("zones")
  private List<String> zones = new ArrayList<String>();

  public GCPConfiguration cloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
    return this;
  }

   /**
   * Credentials to access Google Cloud Platform APIs. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1.
   * @return cloudCredentialsRef
  **/
  @Schema(description = "Credentials to access Google Cloud Platform APIs. It is a reference to an object of type CloudConnectorUser. Field introduced in 18.2.1.")
  public String getCloudCredentialsRef() {
    return cloudCredentialsRef;
  }

  public void setCloudCredentialsRef(String cloudCredentialsRef) {
    this.cloudCredentialsRef = cloudCredentialsRef;
  }

  public GCPConfiguration encryptionKeyId(String encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
    return this;
  }

   /**
   * Key Resource ID of Customer-Managed Encryption Key (CMEK) used to encrypt Service Engine disks and images. Field introduced in 20.1.1.
   * @return encryptionKeyId
  **/
  @Schema(description = "Key Resource ID of Customer-Managed Encryption Key (CMEK) used to encrypt Service Engine disks and images. Field introduced in 20.1.1.")
  public String getEncryptionKeyId() {
    return encryptionKeyId;
  }

  public void setEncryptionKeyId(String encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }

  public GCPConfiguration firewallTargetTags(List<String> firewallTargetTags) {
    this.firewallTargetTags = firewallTargetTags;
    return this;
  }

  public GCPConfiguration addFirewallTargetTagsItem(String firewallTargetTagsItem) {
    if (this.firewallTargetTags == null) {
      this.firewallTargetTags = new ArrayList<String>();
    }
    this.firewallTargetTags.add(firewallTargetTagsItem);
    return this;
  }

   /**
   * Firewall rule network target tags which will be applied on Service Engines to allow ingress and egress traffic for Service Engines. Field introduced in 18.2.1.
   * @return firewallTargetTags
  **/
  @Schema(description = "Firewall rule network target tags which will be applied on Service Engines to allow ingress and egress traffic for Service Engines. Field introduced in 18.2.1.")
  public List<String> getFirewallTargetTags() {
    return firewallTargetTags;
  }

  public void setFirewallTargetTags(List<String> firewallTargetTags) {
    this.firewallTargetTags = firewallTargetTags;
  }

  public GCPConfiguration gcsBucketName(String gcsBucketName) {
    this.gcsBucketName = gcsBucketName;
    return this;
  }

   /**
   * Google Cloud Storage Bucket Name where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, a bucket will be created if this field is not specified. Field introduced in 18.2.1.
   * @return gcsBucketName
  **/
  @Schema(description = "Google Cloud Storage Bucket Name where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, a bucket will be created if this field is not specified. Field introduced in 18.2.1.")
  public String getGcsBucketName() {
    return gcsBucketName;
  }

  public void setGcsBucketName(String gcsBucketName) {
    this.gcsBucketName = gcsBucketName;
  }

  public GCPConfiguration gcsProjectId(String gcsProjectId) {
    this.gcsProjectId = gcsProjectId;
    return this;
  }

   /**
   * Google Cloud Storage Project ID where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.
   * @return gcsProjectId
  **/
  @Schema(description = "Google Cloud Storage Project ID where Service Engine image will be uploaded. This image will be deleted once the image is created in Google compute images. By default, Service Engine Project ID will be used. Field introduced in 18.2.1.")
  public String getGcsProjectId() {
    return gcsProjectId;
  }

  public void setGcsProjectId(String gcsProjectId) {
    this.gcsProjectId = gcsProjectId;
  }

  public GCPConfiguration matchSeGroupSubnet(Boolean matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
    return this;
  }

   /**
   * Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 18.2.1.
   * @return matchSeGroupSubnet
  **/
  @Schema(description = "Match SE group subnets for VIP placement. Default is to not match SE group subnets. Field introduced in 18.2.1.")
  public Boolean isMatchSeGroupSubnet() {
    return matchSeGroupSubnet;
  }

  public void setMatchSeGroupSubnet(Boolean matchSeGroupSubnet) {
    this.matchSeGroupSubnet = matchSeGroupSubnet;
  }

  public GCPConfiguration networkConfig(GCPNetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
    return this;
  }

   /**
   * Get networkConfig
   * @return networkConfig
  **/
  @Schema(required = true, description = "")
  public GCPNetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  public void setNetworkConfig(GCPNetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
  }

  public GCPConfiguration regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * Google Cloud Platform Region Name where Service Engines will be spawned. Field introduced in 18.2.1.
   * @return regionName
  **/
  @Schema(required = true, description = "Google Cloud Platform Region Name where Service Engines will be spawned. Field introduced in 18.2.1.")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public GCPConfiguration seProjectId(String seProjectId) {
    this.seProjectId = seProjectId;
    return this;
  }

   /**
   * Google Cloud Platform Project ID where Service Engines will be spawned. Field introduced in 18.2.1.
   * @return seProjectId
  **/
  @Schema(required = true, description = "Google Cloud Platform Project ID where Service Engines will be spawned. Field introduced in 18.2.1.")
  public String getSeProjectId() {
    return seProjectId;
  }

  public void setSeProjectId(String seProjectId) {
    this.seProjectId = seProjectId;
  }

  public GCPConfiguration vipAllocationStrategy(GCPVIPAllocation vipAllocationStrategy) {
    this.vipAllocationStrategy = vipAllocationStrategy;
    return this;
  }

   /**
   * Get vipAllocationStrategy
   * @return vipAllocationStrategy
  **/
  @Schema(required = true, description = "")
  public GCPVIPAllocation getVipAllocationStrategy() {
    return vipAllocationStrategy;
  }

  public void setVipAllocationStrategy(GCPVIPAllocation vipAllocationStrategy) {
    this.vipAllocationStrategy = vipAllocationStrategy;
  }

  public GCPConfiguration zones(List<String> zones) {
    this.zones = zones;
    return this;
  }

  public GCPConfiguration addZonesItem(String zonesItem) {
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Google Cloud Platform Zones where Service Engines will be distributed for HA. Field introduced in 18.2.1.
   * @return zones
  **/
  @Schema(required = true, description = "Google Cloud Platform Zones where Service Engines will be distributed for HA. Field introduced in 18.2.1.")
  public List<String> getZones() {
    return zones;
  }

  public void setZones(List<String> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPConfiguration gcPConfiguration = (GCPConfiguration) o;
    return Objects.equals(this.cloudCredentialsRef, gcPConfiguration.cloudCredentialsRef) &&
        Objects.equals(this.encryptionKeyId, gcPConfiguration.encryptionKeyId) &&
        Objects.equals(this.firewallTargetTags, gcPConfiguration.firewallTargetTags) &&
        Objects.equals(this.gcsBucketName, gcPConfiguration.gcsBucketName) &&
        Objects.equals(this.gcsProjectId, gcPConfiguration.gcsProjectId) &&
        Objects.equals(this.matchSeGroupSubnet, gcPConfiguration.matchSeGroupSubnet) &&
        Objects.equals(this.networkConfig, gcPConfiguration.networkConfig) &&
        Objects.equals(this.regionName, gcPConfiguration.regionName) &&
        Objects.equals(this.seProjectId, gcPConfiguration.seProjectId) &&
        Objects.equals(this.vipAllocationStrategy, gcPConfiguration.vipAllocationStrategy) &&
        Objects.equals(this.zones, gcPConfiguration.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudCredentialsRef, encryptionKeyId, firewallTargetTags, gcsBucketName, gcsProjectId, matchSeGroupSubnet, networkConfig, regionName, seProjectId, vipAllocationStrategy, zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPConfiguration {\n");
    
    sb.append("    cloudCredentialsRef: ").append(toIndentedString(cloudCredentialsRef)).append("\n");
    sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
    sb.append("    firewallTargetTags: ").append(toIndentedString(firewallTargetTags)).append("\n");
    sb.append("    gcsBucketName: ").append(toIndentedString(gcsBucketName)).append("\n");
    sb.append("    gcsProjectId: ").append(toIndentedString(gcsProjectId)).append("\n");
    sb.append("    matchSeGroupSubnet: ").append(toIndentedString(matchSeGroupSubnet)).append("\n");
    sb.append("    networkConfig: ").append(toIndentedString(networkConfig)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    seProjectId: ").append(toIndentedString(seProjectId)).append("\n");
    sb.append("    vipAllocationStrategy: ").append(toIndentedString(vipAllocationStrategy)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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