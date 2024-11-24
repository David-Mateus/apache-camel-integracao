package com.example.api1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextoController {

    @GetMapping("/api")
    public String enviarTexto() {
        return "API1";
    }
}
