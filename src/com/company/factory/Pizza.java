package com.company.factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("prepare" + getName() + " " + getDough() + " " + getSauce());
    }

    void bake(){
        System.out.println("bake" + getName() + " " + getDough() + " " + getSauce());
    }

    void cut(){
        System.out.println("cut" + getName() + " " + getDough() + " " + getSauce());
    }

    void box(){
        System.out.println("box" + getName() + " " + getDough() + " " + getSauce());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}
