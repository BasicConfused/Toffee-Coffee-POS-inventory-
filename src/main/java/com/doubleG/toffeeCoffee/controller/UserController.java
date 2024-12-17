package com.doubleG.toffeeCoffee.controller;

import com.doubleG.toffeeCoffee.model.User;
import com.doubleG.toffeeCoffee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/Signup") 
    public String showRegistrationForm() {
        return "Signup";
    }
    
    @PostMapping("/Signup")
    public String registerUser(@RequestParam String firstName, @RequestParam String lastName,
                               @RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
        return "redirect:/success"; // Redirect to a success page or another endpoint
    }
}
