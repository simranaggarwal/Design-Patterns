package com.examples.designpatterns.behavioural.command.texteditor;

//Receiver
public class TextEditor {
    protected void insert(String textToCut) {
        System.out.println("'" + textToCut + "' is inserted.");
    }
    protected void copy(String textToCopy) {
        System.out.println("'" + textToCopy + "' is copied to clipboard.");
    }
    protected void paste(String textToPaste) {
        System.out.println("'" + textToPaste + "' is pasted.");
    }
}
