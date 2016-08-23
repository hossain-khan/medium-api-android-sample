/**
 * Medium.com - Unofficial API Spec
 * Medium’s unofficial API documentation using OpenAPI specification.  # Official API Official API document can also be viewed for most up to date API spec at [https://github.com/Medium/medium-api-docs](https://github.com/Medium/medium-api-docs).  Developer resource - [https://medium.com/developers](https://medium.com/developers) 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;


/**
 * Details of Post
 */
@ApiModel(description = "Details of Post")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-22T21:34:48.259-04:00")
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
  private LocalDate publishedAt = null;

  /**
   * The license of the post.
   */
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
      return String.valueOf(value);
    }
  }

  @SerializedName("license")
  private LicenseEnum license = null;

  @SerializedName("licenseUrl")
  private String licenseUrl = null;

  public PostDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the post.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "A unique identifier for the post.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostDetails title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The post’s title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "The post’s title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PostDetails authorId(String authorId) {
    this.authorId = authorId;
    return this;
  }

   /**
   * The userId of the post’s author
   * @return authorId
  **/
  @ApiModelProperty(example = "null", value = "The userId of the post’s author")
  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public PostDetails tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostDetails addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The post’s tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The post’s tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PostDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the post on Medium
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The URL of the post on Medium")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PostDetails canonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
    return this;
  }

   /**
   * The canonical URL of the post. If canonicalUrl was not specified in the creation of the post, this field will not be present.
   * @return canonicalUrl
  **/
  @ApiModelProperty(example = "null", value = "The canonical URL of the post. If canonicalUrl was not specified in the creation of the post, this field will not be present.")
  public String getCanonicalUrl() {
    return canonicalUrl;
  }

  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }

  public PostDetails publishStatus(String publishStatus) {
    this.publishStatus = publishStatus;
    return this;
  }

   /**
   * The publish status of the post.
   * @return publishStatus
  **/
  @ApiModelProperty(example = "null", value = "The publish status of the post.")
  public String getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(String publishStatus) {
    this.publishStatus = publishStatus;
  }

  public PostDetails publishedAt(LocalDate publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * The post’s published date. If created as a draft, this field will not be present.
   * @return publishedAt
  **/
  @ApiModelProperty(example = "null", value = "The post’s published date. If created as a draft, this field will not be present.")
  public LocalDate getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(LocalDate publishedAt) {
    this.publishedAt = publishedAt;
  }

  public PostDetails license(LicenseEnum license) {
    this.license = license;
    return this;
  }

   /**
   * The license of the post.
   * @return license
  **/
  @ApiModelProperty(example = "null", value = "The license of the post.")
  public LicenseEnum getLicense() {
    return license;
  }

  public void setLicense(LicenseEnum license) {
    this.license = license;
  }

  public PostDetails licenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
    return this;
  }

   /**
   * The URL to the license of the post.
   * @return licenseUrl
  **/
  @ApiModelProperty(example = "null", value = "The URL to the license of the post.")
  public String getLicenseUrl() {
    return licenseUrl;
  }

  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDetails postDetails = (PostDetails) o;
    return Objects.equals(this.id, postDetails.id) &&
        Objects.equals(this.title, postDetails.title) &&
        Objects.equals(this.authorId, postDetails.authorId) &&
        Objects.equals(this.tags, postDetails.tags) &&
        Objects.equals(this.url, postDetails.url) &&
        Objects.equals(this.canonicalUrl, postDetails.canonicalUrl) &&
        Objects.equals(this.publishStatus, postDetails.publishStatus) &&
        Objects.equals(this.publishedAt, postDetails.publishedAt) &&
        Objects.equals(this.license, postDetails.license) &&
        Objects.equals(this.licenseUrl, postDetails.licenseUrl);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

