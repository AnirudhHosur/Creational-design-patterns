package com.bad;

public class PizzaStore {
    Pizza pizza;

    /**
     * - There is more to making objects than just using the new operator.
     *   You’ll learn that instantiation is an activity that shouldn’t always be done in public and
     *   can often lead to coupling problems.
     * - Factory Patterns can help save you from embarrassing dependencies
     * */

    public Pizza orderPizza(String type) {
        pizza = new Pizza();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza();
        } else if(type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
