package com.examples.designPatterns.structural.decorator;

//Concrete Decorator
public class CapitaliseText implements TextDecorator {

    //Reference to Concrete Component
    TextEditor textEditor;

    public CapitaliseText(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String decorateText(String str) {
        return str.toUpperCase();
    }

    @Override
    public String transformText() {
        return decorateText(textEditor.transformText());
    }
}
