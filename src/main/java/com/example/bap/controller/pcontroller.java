package com.example.bap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pcontroller {
    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}
