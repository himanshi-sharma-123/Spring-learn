package org.example;

public class Dev {

//    private Laptop laptop;
    private Computer comp;

    private int age;

    public Dev(){
        System.out.println("Dev constructor");
    }

//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev parameterized constructor");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("laptop parametrized constructor");
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build(){
        System.out.println("working on project");
//        laptop.compile();
        comp.compile();
    }
}
