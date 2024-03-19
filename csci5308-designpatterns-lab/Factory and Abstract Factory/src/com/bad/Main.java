package com.bad;

public class Main {

    public static void main(String[] args) throws Exception {

        /** Client for bad code */

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("greek");
    }
}
