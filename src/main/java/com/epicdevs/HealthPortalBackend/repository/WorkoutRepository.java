package com.epicdevs.HealthPortalBackend.repository;

import com.epicdevs.HealthPortalBackend.model.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface WorkoutRepository extends MongoRepository<Workout, String> {
    List<Workout> findByDate(String key);
}
