package com.springnative.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class NativeController {

    @GetMapping("/greet")
    public String greetMethod(@RequestParam(name = "name", required = false) Optional<String> name) {
        String greetMessage = "Hello "+name.orElse("Stranger");
        return greetMessage;
    }

}
