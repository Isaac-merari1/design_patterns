package org.example.structural.bridge;

/**
 * The Bridge Design Pattern is a structural design pattern that separates an object's abstraction from its implementation. This separation allows both
 * the abstraction and implementation to vary independently. This pattern is especially useful when you want to avoid a permanent binding between
 * an abstraction and its implementation.
 *
 *Intent:
 * The Bridge Pattern is used when you want to:
 * Avoid a permanent binding between an abstraction and its implementation.
 * Share an implementation among multiple objects.
 * Provide an interface for different implementations and allow the client to choose the implementation at runtime.
 * Hide implementation details from clients.
 * Structure:
 *
 * The Bridge Pattern involves the following key components:
 *
 * Abstraction: This is the high-level interface that clients interact with. It contains a reference to an implementation object and defines
 * the abstract methods that will be delegated to the implementation.
 *
 * Refined Abstraction: This is an extension of the abstraction that can add additional functionality or modify existing functionality.
 *
 * Implementor: This is an interface or abstract class that defines the methods to be implemented by concrete implementations.
 *
 * Concrete Implementor: These are the concrete classes that implement the implementor interface. They provide the actual implementation
 * for the methods defined in the implementor.
 */
public class Main {
}
