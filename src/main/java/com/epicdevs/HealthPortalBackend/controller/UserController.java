package com.epicdevs.HealthPortalBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.epicdevs.HealthPortalBackend.service.UserService;
import com.epicdevs.HealthPortalBackend.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping
    public String createUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User created";

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserByID(@PathVariable String id) {
        Optional<User> user = userService.findUserByID(id);
        if (user.isPresent()) {
            System.out.println("present");
        }
        else {
            System.out.println("not present");
        }
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
        }

    @GetMapping("/all")
    public String getAllUsers() {
        return userService.getAllUsers();
    }
}


