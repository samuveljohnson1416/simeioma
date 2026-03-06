package com.simeiomagrp.simeioma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Simeioma Application!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "{\"status\": \"UP\"}";
    }
}
