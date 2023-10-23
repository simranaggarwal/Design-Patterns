package com.examples.designPatterns.structural.composite.example2;

//Leaf
public class TextField implements GUIComponent {

    String name;

    public TextField(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Rendering text field " + name);
    }
}
