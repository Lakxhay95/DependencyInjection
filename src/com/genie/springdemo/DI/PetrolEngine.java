package com.genie.springdemo.DI;

public class PetrolEngine implements IEnginer {

    @Override
    public int start() {
        System.out.println("Petrol Engine Started....");
        return 1;
    }
}
