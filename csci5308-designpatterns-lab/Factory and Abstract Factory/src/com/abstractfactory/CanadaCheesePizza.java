package com.abstractfactory;

public class CanadaCheesePizza extends Pizza {
    private IngredientAbstractFactory ingridentFactory;

    public CanadaCheesePizza(IngredientAbstractFactory ingridentFactory) {
        this.ingridentFactory = ingridentFactory;
        this.setName("Canada the Cheese pizza");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+this.getName());
        System.out.println(this.ingridentFactory.createDough().describeDough());
        System.out.println(this.ingridentFactory.createCheese().describeCheese());
        System.out.println(this.ingridentFactory.createSauce().describeSauce());
    }
}
