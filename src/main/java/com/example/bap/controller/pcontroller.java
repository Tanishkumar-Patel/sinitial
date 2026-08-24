package com.example.bap.controller;

import com.example.bap.dto.pdto;
import com.example.bap.service.pservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pcontroller {

    private final pservice pservice;
    public pcontroller(pservice pservice){
        this.pservice = pservice;
    }
    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @PostMapping("/customer")
    public ResponseEntity<pdto> customer(@RequestBody pdto pdto) {
        pdto response = pservice.newCustomer(pdto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
