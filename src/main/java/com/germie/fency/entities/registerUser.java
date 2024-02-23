package com.germie.fency.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class registerUser {

    public String uname;
    public long mobile;
    public String email;
    public String password;

    public registerUser(String uname, long mobile, String email, String password){
       
         this.uname=uname;
         this.email=email;
         this.mobile=mobile;
         this.password=password;
    }
}
