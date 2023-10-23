package com.examples.designpatterns.behavioural.observer;

//Concrete Observer
public class Observer2 implements Observer {
    String name;
    public Observer2(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display(String latestText) {
        System.out.println(latestText + " " + getName());
    }
}
