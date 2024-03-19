package com.abstractfactory;

public interface IngredientAbstractFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}
