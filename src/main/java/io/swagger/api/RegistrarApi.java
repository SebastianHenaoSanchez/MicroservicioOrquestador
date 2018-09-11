/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.JsonApiBodyRequestNegocio;
import io.swagger.model.JsonApiBodyRequestOferta;
import io.swagger.model.JsonApiBodyRequestPersona;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccessNegocio;
import io.swagger.model.JsonApiBodyResponseSuccessOferta;
import io.swagger.model.JsonApiBodyResponseSuccessPersona;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

@Api(value = "registrar", description = "the registrar API")
public interface RegistrarApi {

    @ApiOperation(value = "registro de negocios", nickname = "registrarNegociosPost", notes = "registro de negocios", response = JsonApiBodyResponseSuccessNegocio.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Negocio registrado correctamente", response = JsonApiBodyResponseSuccessNegocio.class),
        @ApiResponse(code = 400, message = "Datos incompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar/negocios",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<JsonApiBodyResponseSuccessNegocio> registrarNegociosPost(@ApiParam(value = "Json a ingresar" ,required=true )  @Valid @RequestBody JsonApiBodyRequestNegocio body);


    @ApiOperation(value = "registro de ofertas", nickname = "registrarOfertasPost", notes = "registro de ofertas", response = JsonApiBodyResponseSuccessOferta.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "oferta registrada correctamente", response = JsonApiBodyResponseSuccessOferta.class),
        @ApiResponse(code = 400, message = "Datos incompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar/ofertas",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<JsonApiBodyResponseSuccessOferta> registrarOfertasPost(@ApiParam(value = "Json a ingresar" ,required=true )  @Valid @RequestBody JsonApiBodyRequestOferta body);


    @ApiOperation(value = "registro de personas", nickname = "registrarPersonasPost", notes = "registro de personas (clientes y administradores)", response = JsonApiBodyResponseSuccessPersona.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Persona registrada correctamente", response = JsonApiBodyResponseSuccessPersona.class),
        @ApiResponse(code = 400, message = "Datos incompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar/personas",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<JsonApiBodyResponseSuccessPersona> registrarPersonasPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestPersona body);

}