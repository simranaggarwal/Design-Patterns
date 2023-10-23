package com.examples.designPatterns.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Observer1("O1");
        Observer observer2 = new Observer2("O2");
        Observer observer3 = new Observer2("O3");

        SubjectImpl subject = new SubjectImpl();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.notifyObservers("This is an old text");
        /*
            This is an old text O1
            This is an old text O2
            This is an old text O3
         */

        subject.removeObserver(observer3);
        System.out.println();
        subject.notifyObservers("This is a new text");
        /*
            This is a new text O1
            This is a new text O2
         */
    }
}
