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
 * PatchData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class PatchData {
  @JsonProperty("patch_image_ref")
  private String patchImageRef = null;

  @JsonProperty("patch_version")
  private String patchVersion = null;

  public PatchData patchImageRef(String patchImageRef) {
    this.patchImageRef = patchImageRef;
    return this;
  }

   /**
   * Image uuid for identifying the patch. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.
   * @return patchImageRef
  **/
  @Schema(description = "Image uuid for identifying the patch. It is a reference to an object of type Image. Field introduced in 18.2.8, 20.1.1.")
  public String getPatchImageRef() {
    return patchImageRef;
  }

  public void setPatchImageRef(String patchImageRef) {
    this.patchImageRef = patchImageRef;
  }

  public PatchData patchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
    return this;
  }

   /**
   * Patch version. Field introduced in 18.2.8, 20.1.1.
   * @return patchVersion
  **/
  @Schema(description = "Patch version. Field introduced in 18.2.8, 20.1.1.")
  public String getPatchVersion() {
    return patchVersion;
  }

  public void setPatchVersion(String patchVersion) {
    this.patchVersion = patchVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchData patchData = (PatchData) o;
    return Objects.equals(this.patchImageRef, patchData.patchImageRef) &&
        Objects.equals(this.patchVersion, patchData.patchVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchImageRef, patchVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchData {\n");
    
    sb.append("    patchImageRef: ").append(toIndentedString(patchImageRef)).append("\n");
    sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
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