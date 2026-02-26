package com.demo.hello_ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String inicio() {
        return "Welcome";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hola Mundo! con CI/CD: 19";
    }
}