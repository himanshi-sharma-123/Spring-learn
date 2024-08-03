package com.example.demo;

import org.springframework.stereotype.Component;

@Component // now spring knows to create the object of Dev class
public class Dev {
    public void build(){
        System.out.println("working on project");
    }
}
