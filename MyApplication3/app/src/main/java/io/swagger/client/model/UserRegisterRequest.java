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
 * UserRegisterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-10T02:09:28.592Z")
public class UserRegisterRequest {
  @SerializedName("checkPassword")
  private String checkPassword = null;

  @SerializedName("userAccount")
  private String userAccount = null;

  @SerializedName("userPassword")
  private String userPassword = null;

  public UserRegisterRequest checkPassword(String checkPassword) {
    this.checkPassword = checkPassword;
    return this;
  }

   /**
   * Get checkPassword
   * @return checkPassword
  **/
  @ApiModelProperty(value = "")
  public String getCheckPassword() {
    return checkPassword;
  }

  public void setCheckPassword(String checkPassword) {
    this.checkPassword = checkPassword;
  }

  public UserRegisterRequest userAccount(String userAccount) {
    this.userAccount = userAccount;
    return this;
  }

   /**
   * Get userAccount
   * @return userAccount
  **/
  @ApiModelProperty(value = "")
  public String getUserAccount() {
    return userAccount;
  }

  public void setUserAccount(String userAccount) {
    this.userAccount = userAccount;
  }

  public UserRegisterRequest userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

   /**
   * Get userPassword
   * @return userPassword
  **/
  @ApiModelProperty(value = "")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegisterRequest userRegisterRequest = (UserRegisterRequest) o;
    return Objects.equals(this.checkPassword, userRegisterRequest.checkPassword) &&
        Objects.equals(this.userAccount, userRegisterRequest.userAccount) &&
        Objects.equals(this.userPassword, userRegisterRequest.userPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkPassword, userAccount, userPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegisterRequest {\n");
    
    sb.append("    checkPassword: ").append(toIndentedString(checkPassword)).append("\n");
    sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
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

