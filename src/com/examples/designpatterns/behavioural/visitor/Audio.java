package com.examples.designpatterns.behavioural.visitor;

//Concrete Element
public class Audio implements Media {
    @Override
    public void accept(MediaProcessor mediaProcessor) {
        mediaProcessor.visit(this);
    }

    @Override
    public String toString() {
        return "Audio{}";
    }
}
