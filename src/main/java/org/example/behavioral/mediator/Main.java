package org.example.behavioral.mediator;

/**
 * The Mediator Design Pattern is a behavioral design pattern that promotes loose coupling by encapsulating how objects interact with each other.
 * It restricts direct communication between objects and forces them to communicate only through a mediator, which centralizes the communication logic.
 * This pattern is particularly useful when a system has a large number of interacting objects, and managing their relationships becomes complex.
 *
 * Intent:
 *
 * Define an object that centralizes the interactions between multiple objects (colleagues) while keeping them independent of each other.
 * Promote the principle of "decoupling" by ensuring that objects interact indirectly through a mediator rather than referencing each other explicitly.
 * Simplify the maintenance and modification of a system by reducing the dependencies between objects.
 */
public class Main {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ConcreteChatRoom();

        CEO ceo = new CEO("CEO", chatRoom);
        Employee employee = new Employee("employee", chatRoom);

        ceo.sendMessage(employee,"Hi employee from ceo");
        employee.sendMessage(ceo,"Hello ceo from employee");
    }
}
