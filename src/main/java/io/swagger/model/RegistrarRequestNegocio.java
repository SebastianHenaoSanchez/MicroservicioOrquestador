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
 * RegistrarRequestNegocio
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

public class RegistrarRequestNegocio   {
  @JsonProperty("idadmin")
  private String idadmin = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("nombreempresa")
  private String nombreempresa = null;

  @JsonProperty("correo")
  private String correo = null;

  @JsonProperty("tiponegocio")
  private String tiponegocio = null;

  @JsonProperty("nit")
  private String nit = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("ubicacion")
  private String ubicacion = null;
  
  @JsonProperty("latitud")
  private String latitud = null;

  @JsonProperty("longitud")
  private String longitud = null;

  public RegistrarRequestNegocio idadmin(String idadmin) {
    this.idadmin = idadmin;
    return this;
  }

  /**
   * Get idadmin
   * @return idadmin
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdadmin() {
    return idadmin;
  }

  public void setIdadmin(String idadmin) {
    this.idadmin = idadmin;
  }

  public RegistrarRequestNegocio idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  


  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public RegistrarRequestNegocio nombreempresa(String nombreempresa) {
    this.nombreempresa = nombreempresa;
    return this;
  }

  /**
   * Get nombreempresa
   * @return nombreempresa
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNombreempresa() {
    return nombreempresa;
  }

  public void setNombreempresa(String nombreempresa) {
    this.nombreempresa = nombreempresa;
  }

  public RegistrarRequestNegocio correo(String correo) {
    this.correo = correo;
    return this;
  }

  /**
   * Get correo
   * @return correo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public RegistrarRequestNegocio tiponegocio(String tiponegocio) {
    this.tiponegocio = tiponegocio;
    return this;
  }

  /**
   * Get tiponegocio
   * @return tiponegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTiponegocio() {
    return tiponegocio;
  }

  public void setTiponegocio(String tiponegocio) {
    this.tiponegocio = tiponegocio;
  }

  public RegistrarRequestNegocio nit(String nit) {
    this.nit = nit;
    return this;
  }

  /**
   * Get nit
   * @return nit
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public RegistrarRequestNegocio foto(String foto) {
    this.foto = foto;
    return this;
  }

  /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public RegistrarRequestNegocio detalle(String detalle) {
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

  public RegistrarRequestNegocio ubicacion(String ubicacion) {
    this.ubicacion = ubicacion;
    return this;
  }

  /**
   * Get ubicacion
   * @return ubicacion
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }
  
  public RegistrarRequestNegocio latitud(String latitud) {
	    this.latitud = latitud;
	    return this;
	  }

	  /**
	   * Get latitud
	   * @return latitud
	  **/
	  @ApiModelProperty(required = true, value = "")
	

	
	  public String getLatitud() {
	    return latitud;
	  }

	  public void setLatitud(String latitud) {
	    this.latitud = latitud;
	  }

	  public RegistrarRequestNegocio longitud(String longitud) {
		    this.longitud = longitud;
		    return this;
		  }

		  /**
		   * Get longitud
		   * @return longitud
		  **/
		  @ApiModelProperty(required = true, value = "")
		

		 
		  public String getLongitud() {
		    return longitud;
		  }

		  public void setLongitud(String longitud) {
		    this.longitud = longitud;
		  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrarRequestNegocio registrarRequestNegocio = (RegistrarRequestNegocio) o;
    return Objects.equals(this.idadmin, registrarRequestNegocio.idadmin) &&
        Objects.equals(this.idnegocio, registrarRequestNegocio.idnegocio) &&
        Objects.equals(this.nombreempresa, registrarRequestNegocio.nombreempresa) &&
        Objects.equals(this.correo, registrarRequestNegocio.correo) &&
        Objects.equals(this.tiponegocio, registrarRequestNegocio.tiponegocio) &&
        Objects.equals(this.nit, registrarRequestNegocio.nit) &&
        Objects.equals(this.foto, registrarRequestNegocio.foto) &&
        Objects.equals(this.detalle, registrarRequestNegocio.detalle) &&
        Objects.equals(this.ubicacion, registrarRequestNegocio.ubicacion)&&
        Objects.equals(this.latitud, registrarRequestNegocio.latitud)&&
        Objects.equals(this.longitud, registrarRequestNegocio.longitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idadmin, idnegocio, nombreempresa, correo, tiponegocio, nit, foto, detalle, ubicacion, latitud, longitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarRequestNegocio {\n");
    
    sb.append("    idadmin: ").append(toIndentedString(idadmin)).append("\n");
    sb.append("    idnegocio: ").append(toIndentedString(idnegocio)).append("\n");
    sb.append("    nombreempresa: ").append(toIndentedString(nombreempresa)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
    sb.append("    tiponegocio: ").append(toIndentedString(tiponegocio)).append("\n");
    sb.append("    nit: ").append(toIndentedString(nit)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    ubicacion: ").append(toIndentedString(ubicacion)).append("\n");
    sb.append("    latitud: ").append(toIndentedString(latitud)).append("\n");
    sb.append("    longitud: ").append(toIndentedString(longitud)).append("\n");
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

