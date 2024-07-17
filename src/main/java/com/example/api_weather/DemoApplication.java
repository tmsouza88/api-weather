package com.example.api_weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class HelloController {
        @GetMapping("/")
        public String hello() {
            return "I Lov You .... Minha Cheirosa..... FUNFO AGORA";
        }
    }
}
