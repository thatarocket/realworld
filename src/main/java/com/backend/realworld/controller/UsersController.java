package com.backend.realworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UsersController {
    
    @GetMapping
    public String getUser() {
        return "Hello Get";
    }

    @PutMapping
    public String updateUser() {
        return "Hello Put";
    }

    @PostMapping
    public String createUser() {
        return "Hello Post";
    }


}
