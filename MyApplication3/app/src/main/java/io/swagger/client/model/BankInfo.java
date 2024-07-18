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
 * BankInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-10T02:09:28.592Z")
public class BankInfo {
  @SerializedName("bank")
  private String bank = null;

  @SerializedName("bankLogoURL")
  private String bankLogoURL = null;

  @SerializedName("bankName")
  private String bankName = null;

  @SerializedName("cardType")
  private String cardType = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("stat")
  private String stat = null;

  public BankInfo bank(String bank) {
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(value = "")
  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public BankInfo bankLogoURL(String bankLogoURL) {
    this.bankLogoURL = bankLogoURL;
    return this;
  }

   /**
   * Get bankLogoURL
   * @return bankLogoURL
  **/
  @ApiModelProperty(value = "")
  public String getBankLogoURL() {
    return bankLogoURL;
  }

  public void setBankLogoURL(String bankLogoURL) {
    this.bankLogoURL = bankLogoURL;
  }

  public BankInfo bankName(String bankName) {
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

  public BankInfo cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public BankInfo key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BankInfo stat(String stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @ApiModelProperty(value = "")
  public String getStat() {
    return stat;
  }

  public void setStat(String stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankInfo bankInfo = (BankInfo) o;
    return Objects.equals(this.bank, bankInfo.bank) &&
        Objects.equals(this.bankLogoURL, bankInfo.bankLogoURL) &&
        Objects.equals(this.bankName, bankInfo.bankName) &&
        Objects.equals(this.cardType, bankInfo.cardType) &&
        Objects.equals(this.key, bankInfo.key) &&
        Objects.equals(this.stat, bankInfo.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bank, bankLogoURL, bankName, cardType, key, stat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankInfo {\n");
    
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    bankLogoURL: ").append(toIndentedString(bankLogoURL)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
