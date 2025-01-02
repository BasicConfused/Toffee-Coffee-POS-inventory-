package com.doubleG.toffeeCoffee.controller;

import com.doubleG.toffeeCoffee.model.User;
import com.doubleG.toffeeCoffee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return "User registered successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

