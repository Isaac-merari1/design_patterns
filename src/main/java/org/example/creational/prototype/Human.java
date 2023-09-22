package org.example.creational.prototype;

public class Human implements LivingThing{

    private String name;
    private String lastName;
    private int age;

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public LivingThing getClone() {
        return new Human(name, lastName, age);
    }

}
