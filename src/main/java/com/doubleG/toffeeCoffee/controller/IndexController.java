package com.doubleG.toffeeCoffee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home() {
        return "index"; // Serves index.html as the home page
    }

    @GetMapping("/login")
    public String login() {
        return "Login"; // Maps to Login.html in templates
    }

    @GetMapping("/signup")
    public String signup() {
        return "Signup"; // Maps to Signup.html in templates
    }

}
