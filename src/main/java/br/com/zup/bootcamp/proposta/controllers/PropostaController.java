package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PropostaController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}