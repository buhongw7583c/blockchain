/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoleAssignmentInput
 */

public class RoleAssignmentInput {
  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("applicationRoleId")
  private Integer applicationRoleId = null;

  public RoleAssignmentInput userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public RoleAssignmentInput applicationRoleId(Integer applicationRoleId) {
    this.applicationRoleId = applicationRoleId;
    return this;
  }

   /**
   * Get applicationRoleId
   * @return applicationRoleId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationRoleId() {
    return applicationRoleId;
  }

  public void setApplicationRoleId(Integer applicationRoleId) {
    this.applicationRoleId = applicationRoleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAssignmentInput roleAssignmentInput = (RoleAssignmentInput) o;
    return Objects.equals(this.userId, roleAssignmentInput.userId) &&
        Objects.equals(this.applicationRoleId, roleAssignmentInput.applicationRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, applicationRoleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAssignmentInput {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    applicationRoleId: ").append(toIndentedString(applicationRoleId)).append("\n");
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

