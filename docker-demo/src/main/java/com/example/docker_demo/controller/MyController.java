package com.example.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/get")
    public String getHello(){
        return "Hello Himanshi!!";
    }
}
