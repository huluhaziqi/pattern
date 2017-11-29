package com.company.factory;

public class Main {

    public static void main(String[] args) {

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = chicagoPizzaStore.orderPizza("Chicago");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ny = nyPizzaStore.orderPizza("NY");
    }
}
