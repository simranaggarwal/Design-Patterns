package com.examples.designPatterns.behavioural.observer;

import java.util.Objects;

//Concrete Observer
public class Observer1 implements Observer {
    String name;
    public Observer1(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Observer1 observer1 = (Observer1) o;
        return Objects.equals(name, observer1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void display(String latestText) {
        System.out.println(latestText + " " + getName());
    }
}
