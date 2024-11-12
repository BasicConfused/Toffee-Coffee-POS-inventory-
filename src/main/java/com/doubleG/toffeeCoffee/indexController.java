package com.doubleG.toffeeCoffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class indexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String userRegistration(){
        return "index";
    }
}
