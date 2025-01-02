package com.doubleG.toffeeCoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/login")
    public String login() {
        return "login"; // Thymeleaf will resolve this to Login.html in templates
    }

    @GetMapping("/Signup")
    public String signup() {
        return "Signup"; // Thymeleaf will resolve this to Signup.html in templates
    }

    @GetMapping("/index")
    public String index() {
        return "index"; // Thymeleaf will resolve this to index.html in templates
    }
}
