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
import io.swagger.client.model.BankInfo;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * AccountVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-10T02:09:28.592Z")
public class AccountVO {
  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("accountType")
  private Integer accountType = null;

  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("bankInfo")
  private BankInfo bankInfo = null;

  @SerializedName("bankName")
  private String bankName = null;

  @SerializedName("createTime")
  private OffsetDateTime createTime = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("reviewMessage")
  private String reviewMessage = null;

  @SerializedName("reviewStatus")
  private Integer reviewStatus = null;

  @SerializedName("reviewTime")
  private OffsetDateTime reviewTime = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("userId")
  private Long userId = null;

  public AccountVO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public AccountVO accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountVO accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public AccountVO balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public AccountVO bankInfo(BankInfo bankInfo) {
    this.bankInfo = bankInfo;
    return this;
  }

   /**
   * Get bankInfo
   * @return bankInfo
  **/
  @ApiModelProperty(value = "")
  public BankInfo getBankInfo() {
    return bankInfo;
  }

  public void setBankInfo(BankInfo bankInfo) {
    this.bankInfo = bankInfo;
  }

  public AccountVO bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public AccountVO createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public AccountVO id(Long id) {
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

  public AccountVO reviewMessage(String reviewMessage) {
    this.reviewMessage = reviewMessage;
    return this;
  }

   /**
   * Get reviewMessage
   * @return reviewMessage
  **/
  @ApiModelProperty(value = "")
  public String getReviewMessage() {
    return reviewMessage;
  }

  public void setReviewMessage(String reviewMessage) {
    this.reviewMessage = reviewMessage;
  }

  public AccountVO reviewStatus(Integer reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(Integer reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public AccountVO reviewTime(OffsetDateTime reviewTime) {
    this.reviewTime = reviewTime;
    return this;
  }

   /**
   * Get reviewTime
   * @return reviewTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReviewTime() {
    return reviewTime;
  }

  public void setReviewTime(OffsetDateTime reviewTime) {
    this.reviewTime = reviewTime;
  }

  public AccountVO updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public AccountVO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVO accountVO = (AccountVO) o;
    return Objects.equals(this.accountName, accountVO.accountName) &&
        Objects.equals(this.accountNumber, accountVO.accountNumber) &&
        Objects.equals(this.accountType, accountVO.accountType) &&
        Objects.equals(this.balance, accountVO.balance) &&
        Objects.equals(this.bankInfo, accountVO.bankInfo) &&
        Objects.equals(this.bankName, accountVO.bankName) &&
        Objects.equals(this.createTime, accountVO.createTime) &&
        Objects.equals(this.id, accountVO.id) &&
        Objects.equals(this.reviewMessage, accountVO.reviewMessage) &&
        Objects.equals(this.reviewStatus, accountVO.reviewStatus) &&
        Objects.equals(this.reviewTime, accountVO.reviewTime) &&
        Objects.equals(this.updateTime, accountVO.updateTime) &&
        Objects.equals(this.userId, accountVO.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, accountType, balance, bankInfo, bankName, createTime, id, reviewMessage, reviewStatus, reviewTime, updateTime, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVO {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    bankInfo: ").append(toIndentedString(bankInfo)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reviewMessage: ").append(toIndentedString(reviewMessage)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    reviewTime: ").append(toIndentedString(reviewTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
