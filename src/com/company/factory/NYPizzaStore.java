package com.company.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String context) {
        Pizza pizza = null;
        if (context.equals("NY")) {
            pizza = new NYStylePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String context) {
        return super.orderPizza(context);
    }
}
