package org.example.behavioral.template;

public abstract class HotBeverage {

    public final void prepareBeverage(){
        boilWater();
        addBeverageIngredient();
        pourInCup();
        addCondiments();
    }
    abstract void addBeverageIngredient();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * In this example, HotBeverage is the abstract class defining the template method prepareBeverage().
     * The concrete subclasses Tea and Coffee provide implementations for addBeverageIngredient() and addCondiments().
     * The template method ensures that the steps of boiling water, adding ingredients, pouring into a cup, and adding condiments are followed in the specified order.
     * Subclasses customize the beverage-specific steps.
     */

}
