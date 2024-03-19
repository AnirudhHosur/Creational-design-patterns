package com.abstractfactory;

public class USIngredientAbstractFactory implements IngredientAbstractFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

}
