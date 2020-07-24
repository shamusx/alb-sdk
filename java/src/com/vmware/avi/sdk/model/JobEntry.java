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
import com.vmware.avi.sdk.model.SubJob;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * JobEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class JobEntry {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("obj_key")
  private String objKey = null;

  @JsonProperty("subjobs")
  private List<SubJob> subjobs = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public JobEntry expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * expires_at of JobEntry.
   * @return expiresAt
  **/
  @Schema(required = true, description = "expires_at of JobEntry.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public JobEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   *  Field introduced in 18.1.2.
   * @return name
  **/
  @Schema(required = true, description = " Field introduced in 18.1.2.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobEntry objKey(String objKey) {
    this.objKey = objKey;
    return this;
  }

   /**
   * obj_key of JobEntry.
   * @return objKey
  **/
  @Schema(required = true, description = "obj_key of JobEntry.")
  public String getObjKey() {
    return objKey;
  }

  public void setObjKey(String objKey) {
    this.objKey = objKey;
  }

  public JobEntry subjobs(List<SubJob> subjobs) {
    this.subjobs = subjobs;
    return this;
  }

  public JobEntry addSubjobsItem(SubJob subjobsItem) {
    if (this.subjobs == null) {
      this.subjobs = new ArrayList<SubJob>();
    }
    this.subjobs.add(subjobsItem);
    return this;
  }

   /**
   *  Field introduced in 18.1.1.
   * @return subjobs
  **/
  @Schema(description = " Field introduced in 18.1.1.")
  public List<SubJob> getSubjobs() {
    return subjobs;
  }

  public void setSubjobs(List<SubJob> subjobs) {
    this.subjobs = subjobs;
  }

  public JobEntry tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public JobEntry uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobEntry jobEntry = (JobEntry) o;
    return Objects.equals(this._lastModified, jobEntry._lastModified) &&
        Objects.equals(this.expiresAt, jobEntry.expiresAt) &&
        Objects.equals(this.name, jobEntry.name) &&
        Objects.equals(this.objKey, jobEntry.objKey) &&
        Objects.equals(this.subjobs, jobEntry.subjobs) &&
        Objects.equals(this.tenantRef, jobEntry.tenantRef) &&
        Objects.equals(this.url, jobEntry.url) &&
        Objects.equals(this.uuid, jobEntry.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, expiresAt, name, objKey, subjobs, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobEntry {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objKey: ").append(toIndentedString(objKey)).append("\n");
    sb.append("    subjobs: ").append(toIndentedString(subjobs)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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