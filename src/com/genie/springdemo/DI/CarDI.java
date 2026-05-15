package com.genie.springdemo.DI;

public class CarDI {

    private IEnginer enginer;

    // Setter Dependency Injection
    public void setEnginer(IEnginer enginer) {
        this.enginer = enginer;
    }
//    public CarDI(IEnginer enginer) {
//        this.enginer = enginer;
//    }
    public void drive() {
        int start = enginer.start();
        if(start >= 1) {
            System.out.println("Engine Started....");
        } else {
            System.out.println("Engine in trouble....");
        }
    }
}
