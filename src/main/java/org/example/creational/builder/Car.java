package org.example.creational.builder;

public class Car {
    private int serialNumber;
    private String color;
    private int age;
    private String lifeSpan;
    private String numberOfDoors;
    private int mileage;

    private Car(CarBuilder builder) {
        this.serialNumber =builder.serialNumber;
        this.color = builder.color;
        this.age = builder.age;
        this.lifeSpan = builder.lifeSpan;
        this.numberOfDoors = builder.numberOfDoors;
        this.mileage = builder.mileage;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }
    @Override
    public String toString() {
        return "Car{" +
                "serialNumber=" + serialNumber +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", lifeSpan='" + lifeSpan + '\'' +
                ", numberOfDoors='" + numberOfDoors + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    static class CarBuilder{
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

        public Car build(){
            return new Car(new CarBuilder());
        }
    }
}

