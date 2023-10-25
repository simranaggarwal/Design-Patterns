package com.examples.designpatterns.behavioural.iterator;

//Aggregate
public interface CustomIterable<T> {
    CustomIterator<T> createAndGetIterator();
}
