package com.company.factory;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String context);

    public Pizza orderPizza(String context) {
        Pizza pizza;
        pizza = createPizza(context);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
