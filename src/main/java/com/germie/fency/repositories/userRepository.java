package com.germie.fency.repositories;

import com.germie.fency.entities.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends MongoRepository<loginUser,String> { }