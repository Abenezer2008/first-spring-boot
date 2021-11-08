package com.example.firstspringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/account")
public class Controller {
    @GetMapping("/test")
    public ResponseEntity<?> testGet(){
        return new ResponseEntity("working fine.", HttpStatus.OK);
    }
}
