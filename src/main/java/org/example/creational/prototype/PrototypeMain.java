package org.example.creational.prototype;

/**
 * The Prototype Design Pattern is a creational design pattern that allows you to create new objects by copying an existing object, known as a prototype.
 * The main idea behind this pattern is to avoid the overhead of creating objects from scratch when their construction is more expensive or complex.
 *
 * Intent:
 * The Prototype Pattern is used to create new objects by copying an existing object, the prototype. This pattern is particularly useful when:
 *
 * The cost of creating an object is more expensive than copying an existing object.
 * Objects have complex configurations and it's more convenient to clone an existing object.
 * Objects need to be created with different initial states, but the construction process is the same.
 *
 * Motivation:
 * Imagine an application where you need to create multiple instances of a complex object with a similar configuration.
 * Instead of initializing each object from scratch, you can use the Prototype Pattern to clone an existing object and customize it as needed.
 * This reduces the overhead of creating complex objects repeatedly.
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Human human1 = new Human("Nath", "Azu",79);
        System.out.println(human1);
//    Human human2 = new Human("Nath", "Azu",79);

        Human human2 = (Human) human1.getClone();
        System.out.println(human2);
    }

}
