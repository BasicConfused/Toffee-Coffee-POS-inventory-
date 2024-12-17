package com.doubleG.toffeeCoffee.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class indexController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/Signup")
    public String signup(){
        return "Signup";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
