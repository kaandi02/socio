package com.germie.fency.entities;
import org.springframework.security.crypto.bcrypt.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class registerUser {
    
    @NotNull
    public String username;
    @NotNull
    @Size(min = 10,max = 10)
    public long mobile;
    @NotNull
    @Email
    public String email;
    @NotNull
    @Size(min = 8,max = 16,message = "password must be within 8 to 16 characters")
    public String password;

    registerUser(String username, long mobile, String email, String password){
         BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
         this.username=username;
         this.email=email;
         this.mobile=mobile;
         this.password=bcrypt.encode(password);
    }
}
