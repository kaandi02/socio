package com.germie.fency.controllers;

import com.germie.fency.entities.*;
import com.germie.fency.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {

    @Autowired
    private userRepository lrepo;

    @PostMapping("/login")
    public ResponseEntity<String> loginPost(@RequestBody loginUser user) {
        System.out.println(lrepo.findById(user.username));
        return ResponseEntity.status(200).body("User Data Added to DB");
    }
}
