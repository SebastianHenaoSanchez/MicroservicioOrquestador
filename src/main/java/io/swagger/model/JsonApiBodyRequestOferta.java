package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OfertasRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequestOferta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

public class JsonApiBodyRequestOferta   {
  @JsonProperty("oferta")
  @Valid
  private List<OfertasRequest> oferta;

  public JsonApiBodyRequestOferta oferta(List<OfertasRequest> oferta) {
    this.oferta = oferta;
    return this;
  }

  public JsonApiBodyRequestOferta addOfertaItem(OfertasRequest ofertaItem) {
    this.oferta.add(ofertaItem);
    return this;
  }

  /**
   * Get oferta
   * @return oferta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<OfertasRequest> getOferta() {
    return oferta;
  }

  public void setOferta(List<OfertasRequest> oferta) {
    this.oferta = oferta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyRequestOferta jsonApiBodyRequestOferta = (JsonApiBodyRequestOferta) o;
    return Objects.equals(this.oferta, jsonApiBodyRequestOferta.oferta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oferta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequestOferta {\n");
    
    sb.append("    oferta: ").append(toIndentedString(oferta)).append("\n");
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

