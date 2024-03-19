package com.abstractfactory;

public class USStore extends Store {
    private IngredientAbstractFactory ingridentFactory;

    public USStore(IngredientAbstractFactory ingridentFactory) {
        this.ingridentFactory = ingridentFactory;
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new USCheesePizza(ingridentFactory);
        }
        return pizza;
    }
}
