package com.examples.designpatterns.structural.composite.example2;

//Leaf
public class Button implements GUIComponent {
    String button;

    public Button(String button) {
        this.button = button;
    }

    @Override
    public void render() {
        System.out.println("Rendering button: " + button);
    }
}
