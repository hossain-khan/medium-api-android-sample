package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Contibutor;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




/**
 * list of contributors for a given publication
 **/
@ApiModel(description = "list of contributors for a given publication")
public class ContibutorResponse   {
  
  @SerializedName("data")
  private List<Contibutor> data = new ArrayList<Contibutor>();
  

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<Contibutor> getData() {
    return data;
  }
  public void setData(List<Contibutor> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContibutorResponse contibutorResponse = (ContibutorResponse) o;
    return Objects.equals(data, contibutorResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContibutorResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
