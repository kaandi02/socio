package com.germie.fency.repositories;

import com.germie.fency.entities.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<loginUser,String> {
}
