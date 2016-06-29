package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Publications provide a way for authors to work collaboratively within a common narrative framework, brand or point of view.
 **/
@ApiModel(description = "Publications provide a way for authors to work collaboratively within a common narrative framework, brand or point of view.")
public class Publication   {
  
  @SerializedName("id")
  private String id = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("description")
  private String description = null;
  
  @SerializedName("url")
  private String url = null;
  
  @SerializedName("imageUrl")
  private String imageUrl = null;
  

  
  /**
   * A unique identifier for the publication.
   **/
  @ApiModelProperty(value = "A unique identifier for the publication.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The publication\u2019s name on Medium.
   **/
  @ApiModelProperty(value = "The publication\u2019s name on Medium.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Short description of the publication
   **/
  @ApiModelProperty(value = "Short description of the publication")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The URL to the publication\u2019s homepage
   **/
  @ApiModelProperty(value = "The URL to the publication\u2019s homepage")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The URL to the publication\u2019s image/logo
   **/
  @ApiModelProperty(value = "The URL to the publication\u2019s image/logo")
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
    Publication publication = (Publication) o;
    return Objects.equals(id, publication.id) &&
        Objects.equals(name, publication.name) &&
        Objects.equals(description, publication.description) &&
        Objects.equals(url, publication.url) &&
        Objects.equals(imageUrl, publication.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, url, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Publication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
