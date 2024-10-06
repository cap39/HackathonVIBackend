package com.epicdevs.HealthPortalBackend.service;

import com.epicdevs.HealthPortalBackend.model.User;
import com.epicdevs.HealthPortalBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user); // Save user to MongoDB
    }

    public Optional<User> findUserByID(String id) {
            return userRepository.findById(id);

    }
}

