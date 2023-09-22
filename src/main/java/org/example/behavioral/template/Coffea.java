package org.example.behavioral.template;

public class Coffea extends HotBeverage{
    @Override
    void addBeverageIngredient() {
        System.out.println("Adding coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
