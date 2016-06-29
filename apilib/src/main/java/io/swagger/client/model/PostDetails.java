package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * Details of Post
 **/
@ApiModel(description = "Details of Post")
public class PostDetails   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("title")
  private String title = null;
  
  @SerializedName("authorId")
  private String authorId = null;
  
  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("canonicalUrl")
  private String canonicalUrl = null;
  
  @SerializedName("publishStatus")
  private String publishStatus = null;
  
  @SerializedName("publishedAt")
  private Date publishedAt = null;
  

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
  private LicenseEnum license = null;
  
  @SerializedName("licenseUrl")
  private String licenseUrl = null;
  

  
  /**
   * A unique identifier for the post.
   **/
  @ApiModelProperty(value = "A unique identifier for the post.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The post\u2019s title
   **/
  @ApiModelProperty(value = "The post\u2019s title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The userId of the post\u2019s author
   **/
  @ApiModelProperty(value = "The userId of the post\u2019s author")
  public String getAuthorId() {
    return authorId;
  }
  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  
  /**
   * The post\u2019s tags
   **/
  @ApiModelProperty(value = "The post\u2019s tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   * The URL of the post on Medium
   **/
  @ApiModelProperty(value = "The URL of the post on Medium")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The canonical URL of the post. If canonicalUrl was not specified in the creation of the post, this field will not be present.
   **/
  @ApiModelProperty(value = "The canonical URL of the post. If canonicalUrl was not specified in the creation of the post, this field will not be present.")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }
  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }

  
  /**
   * The publish status of the post.
   **/
  @ApiModelProperty(value = "The publish status of the post.")
  public String getPublishStatus() {
    return publishStatus;
  }
  public void setPublishStatus(String publishStatus) {
    this.publishStatus = publishStatus;
  }

  
  /**
   * The post\u2019s published date. If created as a draft, this field will not be present.
   **/
  @ApiModelProperty(value = "The post\u2019s published date. If created as a draft, this field will not be present.")
  public Date getPublishedAt() {
    return publishedAt;
  }
  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  
  /**
   * The license of the post.
   **/
  @ApiModelProperty(value = "The license of the post.")
  public LicenseEnum getLicense() {
    return license;
  }
  public void setLicense(LicenseEnum license) {
    this.license = license;
  }

  
  /**
   * The URL to the license of the post.
   **/
  @ApiModelProperty(value = "The URL to the license of the post.")
  public String getLicenseUrl() {
    return licenseUrl;
  }
  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDetails postDetails = (PostDetails) o;
    return Objects.equals(id, postDetails.id) &&
        Objects.equals(title, postDetails.title) &&
        Objects.equals(authorId, postDetails.authorId) &&
        Objects.equals(tags, postDetails.tags) &&
        Objects.equals(url, postDetails.url) &&
        Objects.equals(canonicalUrl, postDetails.canonicalUrl) &&
        Objects.equals(publishStatus, postDetails.publishStatus) &&
        Objects.equals(publishedAt, postDetails.publishedAt) &&
        Objects.equals(license, postDetails.license) &&
        Objects.equals(licenseUrl, postDetails.licenseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, authorId, tags, url, canonicalUrl, publishStatus, publishedAt, license, licenseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    licenseUrl: ").append(toIndentedString(licenseUrl)).append("\n");
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
