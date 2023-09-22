package org.example.structural.adapter;

/**
 * The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together.
 * It acts as a bridge between two incompatible interfaces, making them compatible without changing their source code.
 * This pattern is particularly useful when integrating new features or libraries into existing systems.
 *
 * When to Use the Adapter Pattern:
 *
 * You have an existing class with an interface that does not match the requirements of your client code.
 * You want to reuse an existing class but its interface is incompatible with other parts of your system.
 * You want to create a stable interface for a class that may have multiple variations or versions.
 * You want to decouple the client code from specific implementations.
 * Benefits of the Adapter Pattern:
 *
 * It allows for the integration of existing classes without modifying their source code.
 * It promotes code reusability by enabling the use of existing classes in new contexts.
 * It helps maintain a clean and consistent interface for client code.
 */
public class Main {
public static void main(String[] args) {

    Iphone15 myAdapter = new Iphone4Adapter(new Iphone4());
    myAdapter.chargePhone();
}



}
