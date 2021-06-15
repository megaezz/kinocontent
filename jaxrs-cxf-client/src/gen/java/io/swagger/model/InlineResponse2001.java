package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class InlineResponse2001   {
  
  @Schema(example = "customer", description = "")
  private String login = null;
  
  @Schema(example = "780.8", description = "")
  private BigDecimal balance = null;
  
  @Schema(example = "true", description = "Выполняются ли задания из очереди, или выполнение приостановлено из-за недостаточного баланса")
 /**
   * Выполняются ли задания из очереди, или выполнение приостановлено из-за недостаточного баланса  
  **/
  private Boolean isEnoughBalance = null;
  
  @Schema(example = "1000", description = "")
  private Integer symbolsFrom = null;
  
  @Schema(example = "1100", description = "")
  private Integer symbolsTo = null;
  
  @Schema(example = "Комментарий к заданиям по умолчанию", description = "")
  private String comment = null;
  
  @Schema(example = "Комментарий для себя по умолчанию", description = "")
  private String privateComment = null;
  
  @Schema(example = "true", description = "")
  private Boolean express = null;
 /**
   * Get login
   * @return login
  **/
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public InlineResponse2001 login(String login) {
    this.login = login;
    return this;
  }

 /**
   * Get balance
   * @return balance
  **/
  @JsonProperty("balance")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public InlineResponse2001 balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

 /**
   * Выполняются ли задания из очереди, или выполнение приостановлено из-за недостаточного баланса
   * @return isEnoughBalance
  **/
  @JsonProperty("is_enough_balance")
  public Boolean isIsEnoughBalance() {
    return isEnoughBalance;
  }

  public void setIsEnoughBalance(Boolean isEnoughBalance) {
    this.isEnoughBalance = isEnoughBalance;
  }

  public InlineResponse2001 isEnoughBalance(Boolean isEnoughBalance) {
    this.isEnoughBalance = isEnoughBalance;
    return this;
  }

 /**
   * Get symbolsFrom
   * @return symbolsFrom
  **/
  @JsonProperty("symbols_from")
  public Integer getSymbolsFrom() {
    return symbolsFrom;
  }

  public void setSymbolsFrom(Integer symbolsFrom) {
    this.symbolsFrom = symbolsFrom;
  }

  public InlineResponse2001 symbolsFrom(Integer symbolsFrom) {
    this.symbolsFrom = symbolsFrom;
    return this;
  }

 /**
   * Get symbolsTo
   * @return symbolsTo
  **/
  @JsonProperty("symbols_to")
  public Integer getSymbolsTo() {
    return symbolsTo;
  }

  public void setSymbolsTo(Integer symbolsTo) {
    this.symbolsTo = symbolsTo;
  }

  public InlineResponse2001 symbolsTo(Integer symbolsTo) {
    this.symbolsTo = symbolsTo;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public InlineResponse2001 comment(String comment) {
    this.comment = comment;
    return this;
  }

 /**
   * Get privateComment
   * @return privateComment
  **/
  @JsonProperty("private_comment")
  public String getPrivateComment() {
    return privateComment;
  }

  public void setPrivateComment(String privateComment) {
    this.privateComment = privateComment;
  }

  public InlineResponse2001 privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

 /**
   * Get express
   * @return express
  **/
  @JsonProperty("express")
  public Boolean isExpress() {
    return express;
  }

  public void setExpress(Boolean express) {
    this.express = express;
  }

  public InlineResponse2001 express(Boolean express) {
    this.express = express;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    isEnoughBalance: ").append(toIndentedString(isEnoughBalance)).append("\n");
    sb.append("    symbolsFrom: ").append(toIndentedString(symbolsFrom)).append("\n");
    sb.append("    symbolsTo: ").append(toIndentedString(symbolsTo)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
    sb.append("    express: ").append(toIndentedString(express)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
