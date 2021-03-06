package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DeleteRequestPersona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequestPersonaDelete
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

public class JsonApiBodyRequestPersonaDelete   {
  @JsonProperty("persona")
  @Valid
  private List<DeleteRequestPersona> persona ;

  public JsonApiBodyRequestPersonaDelete persona(List<DeleteRequestPersona> persona) {
    this.persona = persona;
    return this;
  }

  public JsonApiBodyRequestPersonaDelete addPersonaItem(DeleteRequestPersona personaItem) {
    this.persona.add(personaItem);
    return this;
  }

  /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<DeleteRequestPersona> getPersona() {
    return persona;
  }

  public void setPersona(List<DeleteRequestPersona> persona) {
    this.persona = persona;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyRequestPersonaDelete jsonApiBodyRequestPersonaDelete = (JsonApiBodyRequestPersonaDelete) o;
    return Objects.equals(this.persona, jsonApiBodyRequestPersonaDelete.persona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persona);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequestPersonaDelete {\n");
    
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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

