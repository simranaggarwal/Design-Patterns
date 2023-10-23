package com.examples.designpatterns.creational.prototype;

//Couldn't think of any example better than that
public class Main {
    public static void main(String[] args) {
        OnionPizza onionPizza1 = new OnionPizza("thin", true);

        //All the features of Onion Pizza
        Pizza customPizza = onionPizza1.clone();

        //Add or set custom attributes
        customPizza.addToppings("Bell Pepper");

        //Pizza{crust='thin', extraCheese=true, toppings='Onion, Bell Pepper'}
        System.out.println(customPizza);
    }
}
