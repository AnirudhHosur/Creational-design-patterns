package com.factory;
/**Factory design pattern - Implementation
 - When to use ?
 When we have multiple sub classes of a super class and based on the client input we want to
 return the instance of the sub class.
 - It suggests to replace direct object creation of class with calls to that factory class

 - Why to use ? Provides abstraction between implementation and client class and reduces code modification

 Steps to be followed:
 - Crete a Super class that can be interface or abstract class or basic class
 - Factory class should return the instance of subclasses based on the input */

public class Main {

    public static void main(String[] args) throws Exception {

        /** Client for factory pattern
         * - Defines an interface for creating an object, but lets the subclasses decide which class
         *   to instantiate.
         * - This method lets a class defer instantiation to the subclasses.
         * */

        String region = "Canada";

        PizzaStoreFactory pizzaStore = null;
        if(region.equalsIgnoreCase("Canada")) {
            pizzaStore = new CanadaPizzaStoreFactory();
        }
        else if (region.equalsIgnoreCase("US")) {
            pizzaStore = new USPizzaStoreFactory();
        }
        else {
            throw new Exception("Error: Unknown region");
        }
        pizzaStore.orderPizza("greek");
    }
}
