package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs but faster");
    }
}
