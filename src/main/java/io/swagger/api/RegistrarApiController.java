package io.swagger.api;

import io.swagger.model.JsonApiBodyRequestNegocio;
import io.swagger.model.JsonApiBodyRequestOferta;
import io.swagger.model.JsonApiBodyRequestPersona;
import io.swagger.model.JsonApiBodyResponseErrors;
import io.swagger.model.JsonApiBodyResponseSuccessNegocio;
import io.swagger.model.JsonApiBodyResponseSuccessOferta;
import io.swagger.model.JsonApiBodyResponseSuccessPersona;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.json.JSONObject;
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
public class RegistrarApiController implements RegistrarApi {

    private static final Logger log = LoggerFactory.getLogger(RegistrarApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    
    @EndpointInject(uri="direct:post-negocios")
    private FluentProducerTemplate producerNegocio;

    
    @org.springframework.beans.factory.annotation.Autowired
    public RegistrarApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<JsonApiBodyResponseSuccessNegocio> registrarNegociosPost(@ApiParam(value = "Json a ingresar" ,required=true )  @Valid @RequestBody JsonApiBodyRequestNegocio body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Object response = producerNegocio.withBody(body).request();
                JsonApiBodyResponseSuccessNegocio exito = new JsonApiBodyResponseSuccessNegocio();  
                        JSONObject jsonArray = new JSONObject(response.toString());
                        exito.setIdNegocio(jsonArray.getString("id_negocio"));
                        exito.setNombreEmpresa(jsonArray.getString("nombre_empresa"));
                        exito.setTipoNegocio(jsonArray.getString("tipo_negocio"));
                        return new ResponseEntity<JsonApiBodyResponseSuccessNegocio>(exito, HttpStatus.OK);

            } catch (Exception e) {
    //            log.error("Couldn't serialize response for content type application/json", e);
     //           return new ResponseEntity<JsonApiBodyResponseSuccessNegocio>(HttpStatus.INTERNAL_SERVER_ERROR);
            	 System.out.println("PROBLEMAS EN EL ORQUESTADOR");
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccessNegocio>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyResponseSuccessOferta> registrarOfertasPost(@ApiParam(value = "Json a ingresar" ,required=true )  @Valid @RequestBody JsonApiBodyRequestOferta body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyResponseSuccessOferta>(objectMapper.readValue("{  \"idnegocio\" : \"idnegocio\",  \"producto\" : \"producto\",  \"idoferta\" : \"idoferta\",  \"detalle\" : \"detalle\"}", JsonApiBodyResponseSuccessOferta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyResponseSuccessOferta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccessOferta>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<JsonApiBodyResponseSuccessPersona> registrarPersonasPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestPersona body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<JsonApiBodyResponseSuccessPersona>(objectMapper.readValue("{  \"estado\" : \"estado\",  \"id\" : \"id\",  \"nombre\" : \"nombre\"}", JsonApiBodyResponseSuccessPersona.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<JsonApiBodyResponseSuccessPersona>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<JsonApiBodyResponseSuccessPersona>(HttpStatus.NOT_IMPLEMENTED);
    }

}
