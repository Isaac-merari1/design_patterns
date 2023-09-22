package org.example.structural.decorator;

/**
 * The Decorator design pattern is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically,
 * without affecting the behavior of other objects from the same class. It is used to extend the functionalities of objects in a flexible and reusable way.
 *
 * Intent:
 *
 * Attach additional responsibilities to an object dynamically.
 * Provide a flexible alternative to subclassing for extending functionality.
 * Avoid a class explosion when dealing with multiple combinations of features.
 *
 *         Component
 *           /    \
 *          /      \
 * ConcreteComponent Decorator
 *                       |
 *                ConcreteDecorator
 *
 * Components:
 * Component: This is the abstract class or interface that defines the interface for objects that can have responsibilities added to them dynamically.
 * ConcreteComponent: This is the class that implements the Component interface. It represents the core object to which additional responsibilities can be added.
 * Decorator: This is the abstract class that also implements the Component interface. It contains a reference to a Component object and maintains a reference to a
 * ConcreteComponent object. Decorators can add responsibilities to the component either before or after forwarding requests to the component.
 * ConcreteDecorator: These are concrete subclasses of the Decorator class. They add specific responsibilities to the component.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
