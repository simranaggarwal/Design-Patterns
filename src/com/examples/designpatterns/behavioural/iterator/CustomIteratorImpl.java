package com.examples.designpatterns.behavioural.iterator;

//Concrete Iterator
public class CustomIteratorImpl<T> implements CustomIterator {
    private int cursor = 0;
    private Object[] data;
    private int size;

    CustomIteratorImpl(Object[] data, int size) {
        this.data = data;
        this.size = size;
    }
    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public T next() {
        if(cursor != size) {
            T element = (T) data[cursor];
            cursor = cursor + 1;
            return element;
        }
        return null;
    }
}
