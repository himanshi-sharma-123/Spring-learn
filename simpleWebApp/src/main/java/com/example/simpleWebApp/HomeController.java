package com.example.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody // or we can use RestController
    public String greet(){
        return "welcome to web page";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about page";
    }
}
