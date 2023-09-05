package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

    @GetMapping("/mensaje")
    public String mensaje(){
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
