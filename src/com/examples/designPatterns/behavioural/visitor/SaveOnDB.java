package com.examples.designPatterns.behavioural.visitor;

//Concrete Visitor
public class SaveOnDB implements MediaProcessor {
    @Override
    public void visit(Audio audio) {
        System.out.println("Saved on DB " + audio);
    }

    @Override
    public void visit(Video video) {
        System.out.println("Saved on DB " + video);
    }

    @Override
    public void visit(Image image) {
        System.out.println("Saved on DB " + image);
    }
}
