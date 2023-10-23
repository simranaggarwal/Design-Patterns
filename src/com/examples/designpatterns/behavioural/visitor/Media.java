package com.examples.designpatterns.behavioural.visitor;

//Element
public interface Media {
    void accept(MediaProcessor mediaProcessor);
}
