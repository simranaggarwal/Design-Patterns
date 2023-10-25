package com.examples.designpatterns.behavioural.iterator;

//Concrete Aggregate
public class CustomCollection<T> implements CustomIterable {

    private final int size;
    private Object[] data = null;
    private int curr = 0;

    CustomCollection(int size) {
        data = new Object[size];
        this.size = size;
    }

    public void addItem(T item) {
        if(curr != size) {
            data[curr] = item;
            curr = curr + 1;
        }
    }

    //Returning proper concrete iterator
    @Override
    public CustomIterator<T> createAndGetIterator() {
        return new CustomIteratorImpl<>(data, curr);
    }
}
