package org.example.creational.builder;

public class CarBuilder {
    private int serialNumber;
    private String color;
    private int age;
    private String lifeSpan;
    private String numberOfDoors;
    private int mileage;

    public CarBuilder serialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder age(int age) {
        this.age = age;
        return this;
    }

    public CarBuilder lifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
        return this;
    }

    public CarBuilder numberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder mileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

//    public Car build(){
//        return new Car(serialNumber,color, age,lifeSpan, numberOfDoors, mileage);
//    }
}
