package com.abstractfactory;

public class USCheesePizza extends Pizza {
    private IngredientAbstractFactory ingridentFactory;

    public USCheesePizza(IngredientAbstractFactory ingridentFactory) {
        this.ingridentFactory = ingridentFactory;
        this.setName("US Cheese pizza");
    }

    @Override
    void prepare() {
        System.out.println("Preparing the "+this.getName());
        System.out.println(this.ingridentFactory.createDough().describeDough());
        System.out.println(this.ingridentFactory.createCheese().describeCheese());
        System.out.println(this.ingridentFactory.createSauce().describeSauce());
    }
}
