package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // now spring knows to create the object of Dev class
public class Dev {

//    @Autowired // (field injection) it will connect Dev to Laptop class
//    private Laptop laptop;

    @Autowired
    @Qualifier("laptop") // method 3 in case of confusion
    private Computer comp;  // how to connect: the spring searches for BY TYPE and Laptop has Computer type

//    public Dev(Laptop laptop){ // constructor injection
//        this.laptop = laptop;
//    }

//    @Autowired // setter injection
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

//        laptop.compile();
        comp.compile();

        System.out.println("working on project");
    }
}
