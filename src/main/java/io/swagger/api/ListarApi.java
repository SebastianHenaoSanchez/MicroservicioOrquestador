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

@Api(value = "listar", description = "the listar API")
public interface ListarApi {

    @ApiOperation(value = "Retorna todos los negocios", nickname = "listarNegociosGet", notes = "Retorna todos los negocios", response = JsonApiBodyRequestNegocio.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "negocios encontrados", response = JsonApiBodyRequestNegocio.class),
        @ApiResponse(code = 404, message = "negocios no encontrados", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/negocios",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosGet();


    @ApiOperation(value = "buscar negocio por id de administrador", nickname = "listarNegociosIdadminIdadminGet", notes = "retorna los negocios que tiene un administrador", response = JsonApiBodyRequestNegocio.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequestNegocio.class),
        @ApiResponse(code = 404, message = "id_admin no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/negocios/idadmin/{idadmin}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosIdadminIdadminGet(@ApiParam(value = "ID del admin",required=true) @PathVariable("idadmin") String idadmin);


    @ApiOperation(value = "buscar negocio por id", nickname = "listarNegociosIdnegocioIdnegocioGet", notes = "retorna un negocio", response = JsonApiBodyRequestNegocio.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "negocio encontrado", response = JsonApiBodyRequestNegocio.class),
        @ApiResponse(code = 404, message = "idnegocio no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/negocios/idnegocio/{idnegocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosIdnegocioIdnegocioGet(@ApiParam(value = "id de negocio a retornar",required=true) @PathVariable("idnegocio") String idnegocio);


    @ApiOperation(value = "buscar por tipos de negocio", nickname = "listarNegociosTiponegocioTiponegocioGet", notes = "retorna los negocios de un tipo", response = JsonApiBodyRequestNegocio.class, tags={ "negocios", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "listado de algun tipo de negocio", response = JsonApiBodyRequestNegocio.class),
        @ApiResponse(code = 404, message = "tipo de negocio no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/negocios/tiponegocio/{tiponegocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosTiponegocioTiponegocioGet(@ApiParam(value = "tipo de negocio a retornar",required=true) @PathVariable("tiponegocio") String tiponegocio);


    @ApiOperation(value = "Retorna todas las ofertas", nickname = "listarOfertasGet", notes = "Retorna todas las ofertas", response = JsonApiBodyRequestOferta.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "lista de ofertas", response = JsonApiBodyRequestOferta.class),
        @ApiResponse(code = 404, message = "ofertas no encontradas", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/ofertas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestOferta> listarOfertasGet();


    @ApiOperation(value = "buscar oferta por id de negocio", nickname = "listarOfertasIdnegocioIdnegocioGet", notes = "retorna las ofertas de un negocio", response = JsonApiBodyRequestOferta.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequestOferta.class),
        @ApiResponse(code = 404, message = "oferta no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/ofertas/idnegocio/{idnegocio}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestOferta> listarOfertasIdnegocioIdnegocioGet(@ApiParam(value = "ID del negocio",required=true) @PathVariable("idnegocio") String idnegocio);


    @ApiOperation(value = "buscar oferta por id de oferta", nickname = "listarOfertasIdofertaIdofertaGet", notes = "retorna una oferta", response = JsonApiBodyRequestOferta.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = JsonApiBodyRequestOferta.class),
        @ApiResponse(code = 404, message = "oferta no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/ofertas/idoferta/{idoferta}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestOferta> listarOfertasIdofertaIdofertaGet(@ApiParam(value = "ID de la oferta",required=true) @PathVariable("idoferta") String idoferta);


    @ApiOperation(value = "buscar ofertas por producto", nickname = "listarOfertasProductoProductoGet", notes = "retorna las ofertas de un producto", response = JsonApiBodyRequestOferta.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "listado de ofertas por producto", response = JsonApiBodyRequestOferta.class),
        @ApiResponse(code = 404, message = "ofertas no encontradas", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/ofertas/producto/{producto}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestOferta> listarOfertasProductoProductoGet(@ApiParam(value = "ofertas por productos",required=true) @PathVariable("producto") String producto);


    @ApiOperation(value = "buscar personas por estado", nickname = "listarPersonasEstadoEstadoGet", notes = "retorna las personas deacuerdo a roles", response = JsonApiBodyRequestPersona.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "listado de personas con un rol", response = JsonApiBodyRequestPersona.class),
        @ApiResponse(code = 404, message = "estado no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/personas/estado/{estado}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestPersona> listarPersonasEstadoEstadoGet(@ApiParam(value = "rol de personas a retornar",required=true) @PathVariable("estado") String estado);


    @ApiOperation(value = "Retorna todas las personas", nickname = "listarPersonasGet", notes = "Retorna todas las personas", response = JsonApiBodyRequestPersona.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "personas encontradas", response = JsonApiBodyRequestPersona.class),
        @ApiResponse(code = 404, message = "personas no encontradas", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/personas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestPersona> listarPersonasGet();


    @ApiOperation(value = "buscar persona por id", nickname = "listarPersonasIdpersonaIdGet", notes = "retorna una persona por id", response = JsonApiBodyRequestPersona.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "persona encontrada", response = JsonApiBodyRequestPersona.class),
        @ApiResponse(code = 404, message = "id de persona no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/personas/idpersona/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestPersona> listarPersonasIdpersonaIdGet(@ApiParam(value = "ID de la persona",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "buscar persona por rol", nickname = "listarPersonasRolRolGet", notes = "retorna las personas deacuerdo a roles", response = JsonApiBodyRequestPersona.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "listado de personas con un rol", response = JsonApiBodyRequestPersona.class),
        @ApiResponse(code = 404, message = "rol no encontrado", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/listar/personas/rol/{rol}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<JsonApiBodyRequestPersona> listarPersonasRolRolGet(@ApiParam(value = "rol de personas a retornar",required=true) @PathVariable("rol") String rol);

}
