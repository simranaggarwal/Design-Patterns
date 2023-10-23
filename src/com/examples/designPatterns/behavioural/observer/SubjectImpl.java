package com.examples.designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String latestText) {
        for(Observer observer: observerList) {
            observer.display(latestText);
        }
    }
}
