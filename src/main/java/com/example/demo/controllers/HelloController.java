package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping()
    public String getHello() {
        return "Оно работает!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! v3 + фича 1";
    }
}
