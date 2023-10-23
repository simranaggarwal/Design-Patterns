package com.examples.designpatterns.behavioural.observer;

public interface Subject {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String latestText);
}
