package com.company.declare;

public class StarBuzzCaffee {

    public static void main(String[] args) {

        Beverage beverage = new Caffe1();
        System.out.println(beverage.getDescription());

        Beverage beverage1 = new Caffe2();
        System.out.println(beverage1.getDescription());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription());
        System.out.println("$" + beverage1.cost());

        Beverage beverage2 = new Caffe1();
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }
}
