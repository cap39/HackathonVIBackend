package com.epicdevs.HealthPortalBackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> sayHello() {

        return ResponseEntity.ok("TEST SUCCESSFUL");
    }

}
