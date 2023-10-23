package com.examples.designpatterns.structural.decorator;

//Concrete Decorator
public class AddQuotes implements TextDecorator {

    //Reference to Concrete Component
    TextEditor textEditor;

    public AddQuotes(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public String decorateText(String str) {
        return "'" + str + "'";
    }

    @Override
    public String transformText() {
        return decorateText(textEditor.transformText());
    }
}
