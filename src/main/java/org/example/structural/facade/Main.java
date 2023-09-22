package org.example.structural.facade;

/**
 * The Facade Design Pattern is a structural design pattern that provides a simplified, higher-level interface to a subsystem or set of interfaces in a larger system.
 * It hides the complexities of the subsystem and provides a single entry point for the client to interact with the system. This pattern is often used to make
 * complex systems easier to understand and use.
 *
 * Key components of the Facade Pattern:
 *
 * Facade: This is the main interface that clients interact with. It knows which subsystem classes are responsible for a request and delegates client requests
 * to appropriate objects within the subsystem.
 *
 * Subsystems: These are individual classes or components that perform the actual work. They are not aware of the facade and work independently.
 */
public class Main {
    public static void main(String[] args) {
        CarFacade benz = new CarFacade();
        benz.startCar();
        benz.navigateTo("USA");
    }
}
