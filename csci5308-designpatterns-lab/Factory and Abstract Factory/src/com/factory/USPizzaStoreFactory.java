package com.factory;

public class USPizzaStoreFactory extends PizzaStoreFactory {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new USCheesePizza();
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new USGreekPizza();
        }
        return pizza;
    }
}
