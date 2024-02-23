package com.germie.fency.entities;
import org.springframework.security.crypto.bcrypt.*;

import jakarta.annotation.Nonnull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class registerUser {
    
    
    public String uname;
    public long mobile;
    public String email;
    public String password;

    public registerUser(String uname, long mobile, String email, String password){
         BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
         this.uname=uname;
         this.email=email;
         this.mobile=mobile;
         this.password=bcrypt.encode(password);
    }
}
