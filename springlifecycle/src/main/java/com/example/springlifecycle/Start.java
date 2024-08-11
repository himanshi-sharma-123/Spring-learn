package com.example.springlifecycle;

public class Start {
    private double price;

    public Start(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Start{" +
                "price=" + price +
                '}';
    }
}
