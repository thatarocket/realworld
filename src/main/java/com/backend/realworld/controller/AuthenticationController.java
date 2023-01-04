package com.backend.realworld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class AuthenticationController {

    @PostMapping("/login")
    public String authentication() {
        return "authentication working";
    }

    @PostMapping
    public String registration() {
        return "registration working";
    }
    
}
