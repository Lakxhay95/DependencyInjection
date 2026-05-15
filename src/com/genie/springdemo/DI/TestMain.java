package com.genie.springdemo.DI;
//import com.genie.springdemo.loosecouple.*;
import java.lang.reflect.Field;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
//        CarDI car = new CarDI(new PetrolEngine()); // Constructor Dependency Injection
//        car.setEnginer(new PetrolEngine()); // Setter Dependency Injection
//        car.drive();

        // Reflection API
        // Field DependencyInjection
        Class<?> aClass = Class.forName("com.genie.springdemo.DI.CarDI");
        Field field = aClass.getDeclaredField("enginer");
        field.setAccessible(true);
        Object instance = aClass.newInstance();
        CarDI carDI = (CarDI) instance;
        carDI.setEnginer(new PetrolEngine());
        carDI.drive();
    }
}
