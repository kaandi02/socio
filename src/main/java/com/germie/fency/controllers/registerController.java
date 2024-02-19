package com.germie.fency.controllers;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.germie.fency.entities.*;


@RestController
public class registerController {
    @PostMapping("/register")
    public ResponseEntity<String> postMethodName(@RequestBody registerUser reg) {
        //TODO: process POST request
        System.out.print(reg);
        // String salt = KeyGenerator.string().generateKey();
        return ResponseEntity.status(222).body(reg.uname);
    }
    
}


