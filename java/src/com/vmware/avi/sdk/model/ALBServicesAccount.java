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
import com.vmware.avi.sdk.model.ALBServicesAccountUser;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ALBServicesAccount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class ALBServicesAccount {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("users")
  private List<ALBServicesAccountUser> users = null;

  public ALBServicesAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of an Account in the customer portal. Field introduced in 20.1.1.
   * @return id
  **/
  @Schema(description = "ID of an Account in the customer portal. Field introduced in 20.1.1.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ALBServicesAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account to which the customer portal user belongs. Field introduced in 20.1.1.
   * @return name
  **/
  @Schema(description = "Account to which the customer portal user belongs. Field introduced in 20.1.1.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ALBServicesAccount users(List<ALBServicesAccountUser> users) {
    this.users = users;
    return this;
  }

  public ALBServicesAccount addUsersItem(ALBServicesAccountUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<ALBServicesAccountUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Information about users within the account in the customer portal. Field introduced in 20.1.1.
   * @return users
  **/
  @Schema(description = "Information about users within the account in the customer portal. Field introduced in 20.1.1.")
  public List<ALBServicesAccountUser> getUsers() {
    return users;
  }

  public void setUsers(List<ALBServicesAccountUser> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ALBServicesAccount alBServicesAccount = (ALBServicesAccount) o;
    return Objects.equals(this.id, alBServicesAccount.id) &&
        Objects.equals(this.name, alBServicesAccount.name) &&
        Objects.equals(this.users, alBServicesAccount.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ALBServicesAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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