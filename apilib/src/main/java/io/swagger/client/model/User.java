package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;





public class User   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("username")
  private String username = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("imageUrl")
  private String imageUrl = null;
  

  
  /**
   * A unique identifier for the user.
   **/
  @ApiModelProperty(value = "A unique identifier for the user.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The user\u2019s username on Medium.
   **/
  @ApiModelProperty(value = "The user\u2019s username on Medium.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   * The user\u2019s name on Medium.
   **/
  @ApiModelProperty(value = "The user\u2019s name on Medium.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The URL to the user\u2019s profile on Medium
   **/
  @ApiModelProperty(value = "The URL to the user\u2019s profile on Medium")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The URL to the user\u2019s avatar on Medium
   **/
  @ApiModelProperty(value = "The URL to the user\u2019s avatar on Medium")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) &&
        Objects.equals(username, user.username) &&
        Objects.equals(name, user.name) &&
        Objects.equals(url, user.url) &&
        Objects.equals(imageUrl, user.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, name, url, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
