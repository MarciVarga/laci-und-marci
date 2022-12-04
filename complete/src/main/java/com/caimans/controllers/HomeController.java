package com.caimans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController
{
    @GetMapping("/home")
    public String home()
    {
        return "Hello World!";
    }
}