package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;





public class Post   {
  
  @SerializedName("title")
  private String title = null;
  
  @SerializedName("contentFormat")
  private String contentFormat = null;
  
  @SerializedName("content")
  private String content = null;
  
  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();
  
  @SerializedName("canonicalUrl")
  private String canonicalUrl = null;
  

public enum PublishStatusEnum {
  @SerializedName("public")
  PUBLIC("public"),

  @SerializedName("draft")
  DRAFT("draft"),

  @SerializedName("unlisted")
  UNLISTED("unlisted");

  private String value;

  PublishStatusEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("publishStatus")
  private PublishStatusEnum publishStatus = PublishStatusEnum.PUBLIC;
  

public enum LicenseEnum {
  @SerializedName("all-rights-reserved")
  ALL_RIGHTS_RESERVED("all-rights-reserved"),

  @SerializedName("cc-40-by")
  CC_40_BY("cc-40-by"),

  @SerializedName("cc-40-by-sa")
  CC_40_BY_SA("cc-40-by-sa"),

  @SerializedName("cc-40-by-nd")
  CC_40_BY_ND("cc-40-by-nd"),

  @SerializedName("cc-40-by-nc")
  CC_40_BY_NC("cc-40-by-nc"),

  @SerializedName("cc-40-by-nc-nd")
  CC_40_BY_NC_ND("cc-40-by-nc-nd"),

  @SerializedName("cc-40-by-nc-sa")
  CC_40_BY_NC_SA("cc-40-by-nc-sa"),

  @SerializedName("cc-40-zero")
  CC_40_ZERO("cc-40-zero"),

  @SerializedName("public-domain")
  PUBLIC_DOMAIN("public-domain");

  private String value;

  LicenseEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("license")
  private LicenseEnum license = LicenseEnum.ALL_RIGHTS_RESERVED;
  

  
  /**
   * The title of the post. Note that this title is used for SEO and when rendering the post as a listing, but will not appear in the actual post\u2014for that, the title must be specified in the content field as well. Titles longer than 100 characters will be ignored. In that case, a title will be synthesized from the first content in the post when it is published.
   **/
  @ApiModelProperty(required = true, value = "The title of the post. Note that this title is used for SEO and when rendering the post as a listing, but will not appear in the actual post\u2014for that, the title must be specified in the content field as well. Titles longer than 100 characters will be ignored. In that case, a title will be synthesized from the first content in the post when it is published.")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The format of the \"content\" field. There are two valid values, \"html\", and \"markdown\"
   **/
  @ApiModelProperty(required = true, value = "The format of the \"content\" field. There are two valid values, \"html\", and \"markdown\"")
  public String getContentFormat() {
    return contentFormat;
  }
  public void setContentFormat(String contentFormat) {
    this.contentFormat = contentFormat;
  }

  
  /**
   * The body of the post, in a valid, semantic, HTML fragment, or Markdown. Further markups may be supported in the future. For a full list of accepted HTML tags, see here. If you want your title to appear on the post page, you must also include it as part of the post content.
   **/
  @ApiModelProperty(required = true, value = "The body of the post, in a valid, semantic, HTML fragment, or Markdown. Further markups may be supported in the future. For a full list of accepted HTML tags, see here. If you want your title to appear on the post page, you must also include it as part of the post content.")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * Tags to classify the post. Only the first three will be used. Tags longer than 25 characters will be ignored.
   **/
  @ApiModelProperty(value = "Tags to classify the post. Only the first three will be used. Tags longer than 25 characters will be ignored.")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   * The original home of this content, if it was originally published elsewhere.
   **/
  @ApiModelProperty(value = "The original home of this content, if it was originally published elsewhere.")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }
  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }

  
  /**
   * The status of the post. Valid values are `public`, `draft`, or `unlisted`. The default is `public`.
   **/
  @ApiModelProperty(value = "The status of the post. Valid values are `public`, `draft`, or `unlisted`. The default is `public`.")
  public PublishStatusEnum getPublishStatus() {
    return publishStatus;
  }
  public void setPublishStatus(PublishStatusEnum publishStatus) {
    this.publishStatus = publishStatus;
  }

  
  /**
   * The license of the post. Valid values are `all-rights-reserved`, `cc-40-by`, `cc-40-by-sa`, `cc-40-by-nd`, `cc-40-by-nc`, `cc-40-by-nc-nd`, `cc-40-by-nc-sa`, `cc-40-zero`, `public-domain`. The default is `all-rights-reserved`.
   **/
  @ApiModelProperty(value = "The license of the post. Valid values are `all-rights-reserved`, `cc-40-by`, `cc-40-by-sa`, `cc-40-by-nd`, `cc-40-by-nc`, `cc-40-by-nc-nd`, `cc-40-by-nc-sa`, `cc-40-zero`, `public-domain`. The default is `all-rights-reserved`.")
  public LicenseEnum getLicense() {
    return license;
  }
  public void setLicense(LicenseEnum license) {
    this.license = license;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(title, post.title) &&
        Objects.equals(contentFormat, post.contentFormat) &&
        Objects.equals(content, post.content) &&
        Objects.equals(tags, post.tags) &&
        Objects.equals(canonicalUrl, post.canonicalUrl) &&
        Objects.equals(publishStatus, post.publishStatus) &&
        Objects.equals(license, post.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, contentFormat, content, tags, canonicalUrl, publishStatus, license);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contentFormat: ").append(toIndentedString(contentFormat)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
