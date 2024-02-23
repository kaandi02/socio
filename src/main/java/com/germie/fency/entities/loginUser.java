package com.germie.fency.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.*;

@Document(collection = "loggedusers")
public class loginUser {

    @Id
    public String username;
    public String password;

    loginUser(String username, String password){

        BCryptPasswordEncoder BCryptEncoder = new BCryptPasswordEncoder(14);

        this.username = username;
        this.password = BCryptEncoder.encode(password);

    }

}
