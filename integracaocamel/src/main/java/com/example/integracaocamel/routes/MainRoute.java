package com.example.integracaocamel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.spi.annotations.Component;
import org.springframework.Component;


@Component()
public class MainRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.auto);

        rest("/api")
                .produces("application/json")
                .get("/products")
                .to("direct:getProducts")

                .get("/carts/user/{idCliente}")
                .to("direct:getCartByUser")

                .get("/products-by-user-cart/{idCliente}/{idCart}")
                .to("direct:getProductsByUserCart")
        ;
    }
}