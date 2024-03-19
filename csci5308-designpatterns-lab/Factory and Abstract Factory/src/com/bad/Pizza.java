package com.bad;

public class Pizza {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing the " + this.getName());
        System.out.println("Tossing the dough...");
        System.out.println("Adding the ingredients...");
        System.out.println("Adding sauce..");
    }

    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
