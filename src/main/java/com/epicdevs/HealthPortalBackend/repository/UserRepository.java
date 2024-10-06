package com.epicdevs.HealthPortalBackend.repository;

import com.epicdevs.HealthPortalBackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}

