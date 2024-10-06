package com.epicdevs.HealthPortalBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.epicdevs.HealthPortalBackend.service.WorkoutService;
import com.epicdevs.HealthPortalBackend.model.Workout;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;



    @PostMapping
    public String createWorkout(@RequestBody Workout workout) {
        workoutService.saveWorkout(workout);
        return "Workout created";

    }

    @GetMapping("/{date}")
    public List<Workout> getWorkout(@PathVariable String date) {
        return workoutService.getWorkoutByDate(date);
    }
}


