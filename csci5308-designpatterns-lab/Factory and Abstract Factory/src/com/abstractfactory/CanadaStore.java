package com.abstractfactory;

public class CanadaStore extends Store {
    private IngredientAbstractFactory ingridentFactory;

    public CanadaStore(IngredientAbstractFactory ingridentFactory) {
        this.ingridentFactory = ingridentFactory;
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
           pizza = new CanadaCheesePizza(ingridentFactory);
        }
        return pizza;
    }
}
