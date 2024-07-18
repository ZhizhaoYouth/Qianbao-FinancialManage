/*
 * 接口文档
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
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
 * UserQueryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-10T02:09:28.592Z")
public class UserQueryRequest {
  @SerializedName("current")
  private Integer current = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("mpOpenId")
  private String mpOpenId = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("sortField")
  private String sortField = null;

  @SerializedName("sortOrder")
  private String sortOrder = null;

  @SerializedName("unionId")
  private String unionId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("userProfile")
  private String userProfile = null;

  @SerializedName("userRole")
  private String userRole = null;

  public UserQueryRequest current(Integer current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public UserQueryRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserQueryRequest mpOpenId(String mpOpenId) {
    this.mpOpenId = mpOpenId;
    return this;
  }

   /**
   * Get mpOpenId
   * @return mpOpenId
  **/
  @ApiModelProperty(value = "")
  public String getMpOpenId() {
    return mpOpenId;
  }

  public void setMpOpenId(String mpOpenId) {
    this.mpOpenId = mpOpenId;
  }

  public UserQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public UserQueryRequest sortField(String sortField) {
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @ApiModelProperty(value = "")
  public String getSortField() {
    return sortField;
  }

  public void setSortField(String sortField) {
    this.sortField = sortField;
  }

  public UserQueryRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public UserQueryRequest unionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

   /**
   * Get unionId
   * @return unionId
  **/
  @ApiModelProperty(value = "")
  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  public UserQueryRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserQueryRequest userProfile(String userProfile) {
    this.userProfile = userProfile;
    return this;
  }

   /**
   * Get userProfile
   * @return userProfile
  **/
  @ApiModelProperty(value = "")
  public String getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(String userProfile) {
    this.userProfile = userProfile;
  }

  public UserQueryRequest userRole(String userRole) {
    this.userRole = userRole;
    return this;
  }

   /**
   * Get userRole
   * @return userRole
  **/
  @ApiModelProperty(value = "")
  public String getUserRole() {
    return userRole;
  }

  public void setUserRole(String userRole) {
    this.userRole = userRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserQueryRequest userQueryRequest = (UserQueryRequest) o;
    return Objects.equals(this.current, userQueryRequest.current) &&
        Objects.equals(this.id, userQueryRequest.id) &&
        Objects.equals(this.mpOpenId, userQueryRequest.mpOpenId) &&
        Objects.equals(this.pageSize, userQueryRequest.pageSize) &&
        Objects.equals(this.sortField, userQueryRequest.sortField) &&
        Objects.equals(this.sortOrder, userQueryRequest.sortOrder) &&
        Objects.equals(this.unionId, userQueryRequest.unionId) &&
        Objects.equals(this.userName, userQueryRequest.userName) &&
        Objects.equals(this.userProfile, userQueryRequest.userProfile) &&
        Objects.equals(this.userRole, userQueryRequest.userRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, id, mpOpenId, pageSize, sortField, sortOrder, unionId, userName, userProfile, userRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserQueryRequest {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mpOpenId: ").append(toIndentedString(mpOpenId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    unionId: ").append(toIndentedString(unionId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
