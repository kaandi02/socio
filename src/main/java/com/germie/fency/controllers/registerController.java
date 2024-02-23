package com.germie.fency.controllers;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.germie.fency.entities.*;
import com.germie.fency.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class registerController {
    @Autowired
    private regRepository reg_repo;
    @PostMapping("/register")
    public ResponseEntity<String> postMethodName(@RequestBody registerUser reg) {
        
        reg_repo.save(reg);
        // System.out.print(reg);
        // String salt = KeyGenerator.string().generateKey();
        return ResponseEntity.status(201).body(reg.username);
    }
    
}


