package io.swagger.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import io.swagger.model.JsonApiBodyRequestNegocio;

@Component
public class PostNegocio extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:post-negocios")
		.setHeader(Exchange.HTTP_METHOD, constant("POST")) 
        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        .setHeader("Accept", constant("application/json"))
        .log("request microservice para Negocios ${body}")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                   // TODO Auto-generated method stub
                   JsonApiBodyRequestNegocio requestPersona = (JsonApiBodyRequestNegocio) exchange.getIn().getBody();
                   //exchange.setProperty("id", requestPersona.getPersona().get(0).getId());
                   exchange.setProperty("idadmin", requestPersona.getNegocio().get(0).getIdadmin());
                   exchange.setProperty("nombreempresa", requestPersona.getNegocio().get(0).getNombreempresa());
                   exchange.setProperty("nit", requestPersona.getNegocio().get(0).getNit());
                   exchange.setProperty("correo", requestPersona.getNegocio().get(0).getCorreo());
                   exchange.setProperty("tiponegocio", requestPersona.getNegocio().get(0).getTiponegocio());
                   exchange.setProperty("foto", requestPersona.getNegocio().get(0).getFoto());
                   exchange.setProperty("ubicacion", requestPersona.getNegocio().get(0).getUbicacion());
                   exchange.setProperty("detalle", requestPersona.getNegocio().get(0).getDetalle());
                   exchange.setProperty("latitud", requestPersona.getNegocio().get(0).getLatitud());
                   exchange.setProperty("longitud", requestPersona.getNegocio().get(0).getLongitud());
                   
            }
     })
     .to("freemarker:templates/postnegocio.ftl")
     .log("ANTES ${body}")
     .hystrix()
     .hystrixConfiguration().executionTimeoutInMilliseconds(2000).end()
     .to("http4://localhost:8095/negocios/registrar")
     .convertBodyTo(String.class)
     .log("response microservice ${body}")
     //.unmarshal().json(JsonLibrary.Jackson, ClientJsonApiBodyResponseSuccess.class)
     .endHystrix()
     .onFallback()
     .log("se respondio esto ${body}")
     .end();

	}

}
