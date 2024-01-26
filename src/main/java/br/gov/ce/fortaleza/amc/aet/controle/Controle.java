package br.gov.ce.fortaleza.amc.aet.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    
    @GetMapping("/teste")
    public String teste() {
        return "Hello, Clébio!";

    }
}
