package org.example.creational.factory;

/**
 * The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a super class but
 * allows subclasses to alter the type of objects that will be created. It is one of the most commonly used design patterns in Java.
 *
 * Intent:
 * The Factory Pattern defines an interface for creating an object, but it leaves the choice of its type to the subclasses,
 * creation being deferred at the time of instantiation.
 *
 * Motivation:
 * Consider a scenario where an application needs to create different types of objects, but the specific type may not be known until runtime.
 * Without the Factory Pattern, the application would need a complex conditional logic to determine which type of object to create.
 * This can lead to tight coupling between classes and make the code harder to maintain and extend.
 */
public class FactoryMain {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();
        OperatingSystem os = factory.createOS("apple");
        os.getOperatingSystem();

    }
}
