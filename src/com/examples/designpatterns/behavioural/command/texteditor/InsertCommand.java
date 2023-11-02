package com.examples.designpatterns.behavioural.command.texteditor;

//Concrete Command with Receiver (Receiver is optional)
public class InsertCommand implements Command {

    //Defines a binding between Receiver object and action
    TextEditor textEditor;
    String text;
    public InsertCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    //Implements execute()
    @Override
    public void execute() {
        textEditor.insert(text);
    }
}
