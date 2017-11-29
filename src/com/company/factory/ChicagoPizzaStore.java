package com.company.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String context) {
        Pizza pizza = null;
        if (context.equals("Chicago")) {
            pizza = new ChicagoPizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String context) {
        return super.orderPizza(context);
    }
}
