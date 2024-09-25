package com.example.testci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public void getWelcome() {
        System.out.println("WelcomeController");
    }

}
