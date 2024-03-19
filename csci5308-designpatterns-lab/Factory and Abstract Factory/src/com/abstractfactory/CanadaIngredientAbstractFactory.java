package com.abstractfactory;

public class CanadaIngredientAbstractFactory implements IngredientAbstractFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new ChipotleSauce();
    }
}
