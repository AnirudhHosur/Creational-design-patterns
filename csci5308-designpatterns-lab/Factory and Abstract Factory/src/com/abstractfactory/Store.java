package com.abstractfactory;

public abstract class Store {
    Pizza pizza;

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /** Factory method */
    protected abstract Pizza createPizza(String type);
}
