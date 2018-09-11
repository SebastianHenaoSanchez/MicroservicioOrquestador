package io.swagger.api;

import io.swagger.model.JsonApiBodyRequestNegocio;
import io.swagger.model.JsonApiBodyRequestOferta;
import io.swagger.model.JsonApiBodyRequestPersona;
import io.swagger.model.JsonApiBodyResponseErrors;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T17:05:48.141Z")

@Controller
public class ListarApiController implements ListarApi {

    private static final Logger log = LoggerFactory.getLogger(ListarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestNegocio>(objectMapper.readValue("{  \"negocio\" : [ {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  }, {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestNegocio.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosIdadminIdadminGet(@ApiParam(value = "ID del admin",required=true) @PathVariable("idadmin") String idadmin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestNegocio>(objectMapper.readValue("{  \"negocio\" : [ {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  }, {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestNegocio.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosIdnegocioIdnegocioGet(@ApiParam(value = "id de negocio a retornar",required=true) @PathVariable("idnegocio") String idnegocio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestNegocio>(objectMapper.readValue("{  \"negocio\" : [ {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  }, {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestNegocio.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestNegocio> listarNegociosTiponegocioTiponegocioGet(@ApiParam(value = "tipo de negocio a retornar",required=true) @PathVariable("tiponegocio") String tiponegocio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestNegocio>(objectMapper.readValue("{  \"negocio\" : [ {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  }, {    \"idnegocio\" : \"idnegocio\",    \"ubicacion\" : \"ubicacion\",    \"foto\" : \"foto\",    \"nombreempresa\" : \"nombreempresa\",    \"correo\" : \"correo\",    \"nit\" : \"nit\",    \"idadmin\" : \"idadmin\",    \"tiponegocio\" : \"tiponegocio\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestNegocio.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestNegocio>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestOferta> listarOfertasGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestOferta>(objectMapper.readValue("{  \"oferta\" : [ {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  }, {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestOferta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestOferta> listarOfertasIdnegocioIdnegocioGet(@ApiParam(value = "ID del negocio",required=true) @PathVariable("idnegocio") String idnegocio) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestOferta>(objectMapper.readValue("{  \"oferta\" : [ {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  }, {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestOferta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestOferta> listarOfertasIdofertaIdofertaGet(@ApiParam(value = "ID de la oferta",required=true) @PathVariable("idoferta") String idoferta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestOferta>(objectMapper.readValue("{  \"oferta\" : [ {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  }, {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestOferta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestOferta> listarOfertasProductoProductoGet(@ApiParam(value = "ofertas por productos",required=true) @PathVariable("producto") String producto) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestOferta>(objectMapper.readValue("{  \"oferta\" : [ {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  }, {    \"fechainicio\" : \"fechainicio\",    \"idnegocio\" : \"idnegocio\",    \"foto\" : \"foto\",    \"descuento\" : \"descuento\",    \"valor\" : \"valor\",    \"producto\" : \"producto\",    \"idoferta\" : \"idoferta\",    \"fechafinal\" : \"fechafinal\",    \"detalle\" : \"detalle\"  } ]}", JsonApiBodyRequestOferta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestOferta>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestPersona> listarPersonasEstadoEstadoGet(@ApiParam(value = "rol de personas a retornar",required=true) @PathVariable("estado") String estado) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestPersona>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  } ]}", JsonApiBodyRequestPersona.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestPersona> listarPersonasGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestPersona>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  } ]}", JsonApiBodyRequestPersona.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestPersona> listarPersonasIdpersonaIdGet(@ApiParam(value = "ID de la persona",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestPersona>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  } ]}", JsonApiBodyRequestPersona.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyRequestPersona> listarPersonasRolRolGet(@ApiParam(value = "rol de personas a retornar",required=true) @PathVariable("rol") String rol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyRequestPersona>(objectMapper.readValue("{  \"persona\" : [ {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  }, {    \"apellidos\" : \"apellidos\",    \"estado\" : \"estado\",    \"ciudad\" : \"ciudad\",    \"correo\" : \"correo\",    \"genero\" : \"genero\",    \"contrasena\" : \"contrasena\",    \"id\" : \"id\",    \"telefono\" : \"telefono\",    \"nombre\" : \"nombre\",    \"rol\" : \"rol\",    \"token\" : \"token\"  } ]}", JsonApiBodyRequestPersona.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyRequestPersona>(HttpStatus.NOT_IMPLEMENTED);
    }

}
