package com.company.declare;

public abstract class Beverage {
    String description = "unknow beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
