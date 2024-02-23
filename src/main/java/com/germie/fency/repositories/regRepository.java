package com.germie.fency.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.germie.fency.entities.registerUser;

public interface regRepository extends MongoRepository<registerUser,String>{
    
}
