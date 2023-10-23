package com.examples.designpatterns.behavioural.visitor;

//Visitor
//Provides the methods for all concrete elements.
//With this design pattern, it is easier to add a new MediaProcessor
//If the logic in MediaProcessor changes, the elements need not worry about that
public interface MediaProcessor {
    void visit(Audio audio);
    void visit(Video video);
    void visit(Image image);
}
