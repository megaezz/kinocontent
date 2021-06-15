package io.swagger.model;


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

public class InlineResponse200   {
  
  @Schema(example = "2589887", description = "")
  private Integer id = null;
  
  @Schema(example = "404900", description = "")
  private Integer kinopoiskId = null;
  
  @Schema(example = "Написанный текст", description = "")
  private String text = null;
  
  @Schema(example = "1050", description = "")
  private Integer textLength = null;
  
  @Schema(example = "1000", description = "")
  private Integer symbolsFrom = null;
  
  @Schema(example = "1100", description = "")
  private Integer symbolsTo = null;
  
  @Schema(example = "100", description = "")
  private Integer unique = null;
  
  @Schema(example = "Комментарий к заданию", description = "")
  private String comment = null;
  
  @Schema(example = "Приватный комментарий (видит только сам пользователь)", description = "")
  private String privateComment = null;
  
  @Schema(example = "true", description = "")
  private Boolean confirmed = null;
  
  @Schema(example = "true", description = "")
  private Boolean express = null;
  
  @Schema(example = "false", description = "")
  private Boolean archived = null;
  
  @Schema(example = "true", description = "")
  private Boolean moderated = null;
  
  @Schema(example = "false", description = "")
  private Boolean rework = null;
  
  @Schema(example = "Комментарий доработки", description = "")
  private String reworkComment = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse200 id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get kinopoiskId
   * @return kinopoiskId
  **/
  @JsonProperty("kinopoisk_id")
  public Integer getKinopoiskId() {
    return kinopoiskId;
  }

  public void setKinopoiskId(Integer kinopoiskId) {
    this.kinopoiskId = kinopoiskId;
  }

  public InlineResponse200 kinopoiskId(Integer kinopoiskId) {
    this.kinopoiskId = kinopoiskId;
    return this;
  }

 /**
   * Get text
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public InlineResponse200 text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Get textLength
   * @return textLength
  **/
  @JsonProperty("text_length")
  public Integer getTextLength() {
    return textLength;
  }

  public void setTextLength(Integer textLength) {
    this.textLength = textLength;
  }

  public InlineResponse200 textLength(Integer textLength) {
    this.textLength = textLength;
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

  public InlineResponse200 symbolsFrom(Integer symbolsFrom) {
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

  public InlineResponse200 symbolsTo(Integer symbolsTo) {
    this.symbolsTo = symbolsTo;
    return this;
  }

 /**
   * Get unique
   * @return unique
  **/
  @JsonProperty("unique")
  public Integer getUnique() {
    return unique;
  }

  public void setUnique(Integer unique) {
    this.unique = unique;
  }

  public InlineResponse200 unique(Integer unique) {
    this.unique = unique;
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

  public InlineResponse200 comment(String comment) {
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

  public InlineResponse200 privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

 /**
   * Get confirmed
   * @return confirmed
  **/
  @JsonProperty("confirmed")
  public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public InlineResponse200 confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
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

  public InlineResponse200 express(Boolean express) {
    this.express = express;
    return this;
  }

 /**
   * Get archived
   * @return archived
  **/
  @JsonProperty("archived")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public InlineResponse200 archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

 /**
   * Get moderated
   * @return moderated
  **/
  @JsonProperty("moderated")
  public Boolean isModerated() {
    return moderated;
  }

  public void setModerated(Boolean moderated) {
    this.moderated = moderated;
  }

  public InlineResponse200 moderated(Boolean moderated) {
    this.moderated = moderated;
    return this;
  }

 /**
   * Get rework
   * @return rework
  **/
  @JsonProperty("rework")
  public Boolean isRework() {
    return rework;
  }

  public void setRework(Boolean rework) {
    this.rework = rework;
  }

  public InlineResponse200 rework(Boolean rework) {
    this.rework = rework;
    return this;
  }

 /**
   * Get reworkComment
   * @return reworkComment
  **/
  @JsonProperty("rework_comment")
  public String getReworkComment() {
    return reworkComment;
  }

  public void setReworkComment(String reworkComment) {
    this.reworkComment = reworkComment;
  }

  public InlineResponse200 reworkComment(String reworkComment) {
    this.reworkComment = reworkComment;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kinopoiskId: ").append(toIndentedString(kinopoiskId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textLength: ").append(toIndentedString(textLength)).append("\n");
    sb.append("    symbolsFrom: ").append(toIndentedString(symbolsFrom)).append("\n");
    sb.append("    symbolsTo: ").append(toIndentedString(symbolsTo)).append("\n");
    sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    express: ").append(toIndentedString(express)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    moderated: ").append(toIndentedString(moderated)).append("\n");
    sb.append("    rework: ").append(toIndentedString(rework)).append("\n");
    sb.append("    reworkComment: ").append(toIndentedString(reworkComment)).append("\n");
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
