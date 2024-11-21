package com.doubleG.toffeeCoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class indexController {
    /*@GetMapping("/")
    public String index(){
        return "index";
    }*/
    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("title", "Spring Boot x Tailwind CSS");
        return "index";
    }
}
