package com.example.api2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api2")
public class ApiController {
    private String receivedText; // Variável para armazenar o texto

    @PostMapping("/receive-text")
    public ResponseEntity<String> receiveText(@RequestBody String text) {
        receivedText = text; // Armazena o texto recebido
        System.out.println("Texto recebido: " + text);
        return ResponseEntity.ok("Texto processado: " + text);
    }

    @GetMapping("/get-text")
    public ResponseEntity<String> getStoredText() {
        if (receivedText != null) {
            return ResponseEntity.ok("Texto armazenado: " + receivedText);
        }
        return ResponseEntity.ok("Nenhum texto recebido ainda.");
    }
}
