package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyResponseSuccessOferta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

public class JsonApiBodyResponseSuccessOferta   {
  @JsonProperty("idoferta")
  private String idoferta = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("producto")
  private String producto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  public JsonApiBodyResponseSuccessOferta idoferta(String idoferta) {
    this.idoferta = idoferta;
    return this;
  }

  /**
   * Get idoferta
   * @return idoferta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdoferta() {
    return idoferta;
  }

  public void setIdoferta(String idoferta) {
    this.idoferta = idoferta;
  }

  public JsonApiBodyResponseSuccessOferta idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public JsonApiBodyResponseSuccessOferta producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public JsonApiBodyResponseSuccessOferta detalle(String detalle) {
    this.detalle = detalle;
    return this;
  }

  /**
   * Get detalle
   * @return detalle
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyResponseSuccessOferta jsonApiBodyResponseSuccessOferta = (JsonApiBodyResponseSuccessOferta) o;
    return Objects.equals(this.idoferta, jsonApiBodyResponseSuccessOferta.idoferta) &&
        Objects.equals(this.idnegocio, jsonApiBodyResponseSuccessOferta.idnegocio) &&
        Objects.equals(this.producto, jsonApiBodyResponseSuccessOferta.producto) &&
        Objects.equals(this.detalle, jsonApiBodyResponseSuccessOferta.detalle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idoferta, idnegocio, producto, detalle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyResponseSuccessOferta {\n");
    
    sb.append("    idoferta: ").append(toIndentedString(idoferta)).append("\n");
    sb.append("    idnegocio: ").append(toIndentedString(idnegocio)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
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

