package com.examples.designpatterns.behavioural.command.texteditor;

//Concrete Command with Receiver (Receiver is optional)
public class PasteCommand implements Command {

    //Defines a binding between Receiver object and action
    TextEditor textEditor;
    String text;
    public PasteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    //Implements execute()
    @Override
    public void execute() {
        textEditor.paste(text);
    }
}
