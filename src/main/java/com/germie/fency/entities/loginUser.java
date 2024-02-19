package com.germie.fency.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loggedusers")
public class loginUser {
    public String username;
    public String password;

    loginUser(String username, String password){
        this.username = username;
        this.password = password;
    }

}
