package com.examples.designPatterns.behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        TextEditor capitalise = new Capitalise();
        TextEditor addQuotes = new AddQuotes();
        TextEditor transform = new Transform();

        TextChain textChain1 = new TextChain();
        textChain1.addEditors(capitalise);
        textChain1.addEditors(addQuotes);
        textChain1.addEditors(transform);

        textChain1.doFilters("This is a text.");

        System.out.println();

        //Order matters
        TextChain textChain2 = new TextChain();

        textChain2.addEditors(capitalise);
        textChain2.addEditors(transform);
        textChain2.addEditors(addQuotes);

        textChain2.doFilters("This is another text.");

    }
}
