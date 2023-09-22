package org.example.creational.builder;

/**
 * It is used to construct a complex object step by step and the final step will return the object.
 * Builder pattern aims to “Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.”
 */

public class BuilderMain {
    public static void main(String[] args) {
//        System.out.println("hello Builder 111");

//        Car benz = new Car(111, "red", 19, "ten", "four", 12);
//        System.out.println(benz);
//
        Car bmw = Car.builder().age(5).color("red").build();
        System.out.println(bmw);
    }
}
