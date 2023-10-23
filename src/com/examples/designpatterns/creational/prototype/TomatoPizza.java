package com.examples.designpatterns.creational.prototype;

//Concrete Prototype
public class TomatoPizza extends Pizza {
    public TomatoPizza(String crust, Boolean extraCheese) {
        this.crust = crust;
        this.extraCheese = extraCheese;
        this.toppings = "Tomato";
    }

    @Override
    public Pizza clone() {
        return new TomatoPizza(this.crust, this.extraCheese);
    }
}
