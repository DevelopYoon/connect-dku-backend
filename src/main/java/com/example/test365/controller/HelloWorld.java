package com.example.test365.controller;


        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }
}