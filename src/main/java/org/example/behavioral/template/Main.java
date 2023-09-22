package org.example.behavioral.template;

/**
 * The Template Method design pattern is a behavioral pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps
 * of the algorithm without changing its structure. It's particularly useful when you have an algorithm that consists of a series of steps, but the implementation of each step can vary.
 *
 * Intent:
 *
 * Define the structure of an algorithm in the superclass but allow subclasses to alter certain steps of the algorithm without changing its overall structure.
 * Promote code reusability by encapsulating common behavior in the superclass while allowing customization in the subclasses.
 * Ensure that the steps of an algorithm are followed in a specific order, with some steps being optional or customized.
 */
public class Main {
    public static void main(String[] args) {
        HotBeverage tea = new Tea();
        HotBeverage coffee = new Coffea();

        System.out.println("Making tea:");
        tea.prepareBeverage();

        System.out.println("\nMaking coffee:");
        coffee.prepareBeverage();
    }
}
