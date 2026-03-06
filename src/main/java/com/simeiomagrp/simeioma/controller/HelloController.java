package com.simeiomagrp.simeioma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String sayHello() {
        return "The backend is working!";
    }
}