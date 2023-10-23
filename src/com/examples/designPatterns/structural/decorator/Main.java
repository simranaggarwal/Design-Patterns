package com.examples.designPatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditorImpl("this is a text.");

        TextDecorator capitaliseText = new CapitaliseText(textEditor);
        //THIS IS A TEXT.
        System.out.println(capitaliseText.transformText());

        TextDecorator addQuotes = new AddQuotes(capitaliseText);
        //'THIS IS A TEXT.'
        System.out.println(addQuotes.transformText());

    }
}
