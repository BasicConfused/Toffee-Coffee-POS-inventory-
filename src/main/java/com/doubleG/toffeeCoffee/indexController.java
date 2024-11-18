package com.doubleG.toffeeCoffee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class indexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String userRegistration(){
        return "Sign-up";
    }
}
