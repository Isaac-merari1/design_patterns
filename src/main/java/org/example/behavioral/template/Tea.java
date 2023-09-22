package org.example.behavioral.template;

public class Tea extends HotBeverage{
    @Override
    void addBeverageIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
