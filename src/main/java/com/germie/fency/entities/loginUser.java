package com.germie.fency.entities;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.*;

@Document(collection = "loggedusers")
public class loginUser {


    @NotNull
    public String username;
    @NotNull
    public String password;

    loginUser(String username, String password){

        BCryptPasswordEncoder BCryptEncoder = new BCryptPasswordEncoder(14);

        this.username = username;
        this.password = BCryptEncoder.encode(password);

    }

}
