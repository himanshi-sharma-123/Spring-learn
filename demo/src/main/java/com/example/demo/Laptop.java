package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // in case of confusion this class will be preferred
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs");
    }
}
