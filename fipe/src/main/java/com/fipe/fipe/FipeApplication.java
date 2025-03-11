package com.example.fipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@SpringBootApplication
public class FipeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FipeApplication.class, args);
    }
}

@RestController
@RequestMapping("/fipe")
class FipeController {
    private final String BASE_URL = "https://parallelum.com.br/fipe/api/v1/carros";
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/marcas")
    public Object getMarcas() {
        return restTemplate.getForObject(BASE_URL + "/marcas", Object.class);
    }

    @GetMapping("/marcas/{marcaId}/modelos")
    public Object getModelos(@PathVariable String marcaId) {
        return restTemplate.getForObject(BASE_URL + "/marcas/" + marcaId + "/modelos", Object.class);
    }

    @GetMapping("/marcas/{marcaId}/modelos/{modeloId}/anos")
    public Object getAnos(@PathVariable String marcaId, @PathVariable String modeloId) {
        return restTemplate.getForObject(BASE_URL + "/marcas/" + marcaId + "/modelos/" + modeloId + "/anos", Object.class);
    }

    @GetMapping("/marcas/{marcaId}/modelos/{modeloId}/anos/{anoId}")
    public Object getValor(@PathVariable String marcaId, @PathVariable String modeloId, @PathVariable String anoId) {
        return restTemplate.getForObject(BASE_URL + "/marcas/" + marcaId + "/modelos/" + modeloId + "/anos/" + anoId, Object.class);
    }
}