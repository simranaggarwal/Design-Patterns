package com.examples.designPatterns.creational.prototype;

//Prototype
public abstract class Pizza {
    String crust;
    Boolean extraCheese;
    String toppings;

    public void addToppings(String toppings) {
        this.toppings += ", " + toppings;
    }

    public abstract Pizza clone();

    @Override
    public String toString() {
        return "Pizza{" +
                "crust='" + crust + '\'' +
                ", extraCheese=" + extraCheese +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
