package com.example.redisJwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Hello Himanshi!! "+request.getSession().getId();
    }

}
