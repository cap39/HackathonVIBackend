package com.epicdevs.HealthPortalBackend.service;

import com.epicdevs.HealthPortalBackend.model.Workout;
import com.epicdevs.HealthPortalBackend.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout saveWorkout(Workout workout) {
        return workoutRepository.save(workout); // Save user to MongoDB
    }

    public List<Workout> getWorkoutByDate(String date) {
        return workoutRepository.findByDate(date);
    }
}
