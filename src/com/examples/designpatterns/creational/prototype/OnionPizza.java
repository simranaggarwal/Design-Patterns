package com.examples.designpatterns.creational.prototype;

//Concrete Prototype
public class OnionPizza extends Pizza {
    public OnionPizza(String crust, Boolean extraCheese) {
        this.crust = crust;
        this.extraCheese = extraCheese;
        this.toppings = "Onion";
    }

    @Override
    public Pizza clone() {
        return new OnionPizza(this.crust, this.extraCheese);
    }
}
