package com.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello, World! Meu nome é Diana e meu RA é 12121567";
    }
}
