package com.examples.designPatterns.behavioural.visitor;

//Element
public interface Media {
    void accept(MediaProcessor mediaProcessor);
}
