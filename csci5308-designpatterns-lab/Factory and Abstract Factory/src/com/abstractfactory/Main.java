package com.abstractfactory;

/** Abstract Factory design pattern - Implementation
 - When to use ?
 To produce families of related objects without specifying their concrete classes.
 For example, if we need to create a individual object which has a match with other objects of
 same family. Then we can club it into same factory class
 - Why to use ?
 1) Better abstraction than factory pattern
 2) No if-else or switch case logic like Factory Pattern
 3) Loosely Coupled code for adding new products
 4) Removes the burden from client to factory
 5) Easy to extend.
 6) Provides another layer of abstraction for factories whereas Factory pattern
 provides abstraction for concrete products
 */

public class Main {

    public static void main(String[] args) throws Exception {

        /** Client for abstract factory pattern
         * We have same product families like cheese pizza, greek pizza, pepperoni pizza
         * (with common ingredients like dough, sauce, cheese veggies) but different implementations based on region.
         * Canada cheese pizza and US cheese pizza uses two different preparation style.
         * */

        String abstractRegion = "US";

        Store store = null;
        IngredientAbstractFactory ingridentFactory = null;

        if(abstractRegion.equalsIgnoreCase("Canada")) {
            ingridentFactory = new CanadaIngredientAbstractFactory();
            store = new CanadaStore(ingridentFactory);
        }
        else if (abstractRegion.equalsIgnoreCase("US")) {
            ingridentFactory = new USIngredientAbstractFactory();
            store = new USStore(ingridentFactory);
        }
        else {
            throw new Exception("Error: Unknown region");
        }
        store.orderPizza("cheese");
    }
}
