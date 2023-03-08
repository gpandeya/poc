package com.mck.poc.pocservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POCController {

    @GetMapping("/poc")
    public String sayHello(){
        return "Hello from POCController";
    }
}
