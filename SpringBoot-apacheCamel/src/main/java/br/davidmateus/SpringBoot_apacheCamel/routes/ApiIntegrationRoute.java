package br.davidmateus.SpringBoot_apacheCamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ApiIntegrationRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:fetch?period=5000") //executa a cada 5 segundos
                .to("http://localhost:8080/api") // pega o texto
                .log("Textto recebido da API1:${body}")
                .to("http://localhost:8081/api2/receive-text")
                .log("Texto enviado para a API 2: ${body}");
    }
}
