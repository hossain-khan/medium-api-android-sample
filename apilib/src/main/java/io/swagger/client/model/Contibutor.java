package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Contibutor
 **/
@ApiModel(description = "Contibutor")
public class Contibutor   {
  
  @SerializedName("publicationId")
  private String publicationId = null;
  
  @SerializedName("userId")
  private String userId = null;
  
  @SerializedName("role")
  private String role = null;
  

  
  /**
   * An ID for the publication. This can be lifted from response of publications above
   **/
  @ApiModelProperty(value = "An ID for the publication. This can be lifted from response of publications above")
  public String getPublicationId() {
    return publicationId;
  }
  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  
  /**
   * A user ID of the contributor.
   **/
  @ApiModelProperty(value = "A user ID of the contributor.")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Role of the user identified by userId in the publication identified by `publicationId`. *editor* or *writer*
   **/
  @ApiModelProperty(value = "Role of the user identified by userId in the publication identified by `publicationId`. *editor* or *writer*")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contibutor contibutor = (Contibutor) o;
    return Objects.equals(publicationId, contibutor.publicationId) &&
        Objects.equals(userId, contibutor.userId) &&
        Objects.equals(role, contibutor.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationId, userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contibutor {\n");
    
    sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
