package com.factory;

public class CanadaPizzaStoreFactory extends PizzaStoreFactory {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
           pizza = new CanadaCheesePizza();
        } else if (type.equalsIgnoreCase("greek")) {
           pizza = new CanadaGreekPizza();
        }
        return pizza;
    }
}
