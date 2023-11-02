package com.examples.designpatterns.behavioural.command;

import com.examples.designpatterns.behavioural.command.texteditor.*;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        //Command without receiver
        Command openCommand = new OpenCommand("file.text");

        //Commands with receiver
        Command insertCommand = new InsertCommand(textEditor, "This is a long text");
        String selectedText = "long text";
        Command copyCommand = new CopyCommand(textEditor, selectedText);
        Command pasteCommand = new PasteCommand(textEditor, selectedText);

        //Command without receiver
        Command closeCommand = new CloseCommand("file.text");

        TextEditorCommandExecutor textEditorCommandExecutor = new TextEditorCommandExecutor();

        textEditorCommandExecutor.addCommand(openCommand);
        textEditorCommandExecutor.addCommand(insertCommand);
        textEditorCommandExecutor.addCommand(copyCommand);
        textEditorCommandExecutor.addCommand(pasteCommand);
        textEditorCommandExecutor.addCommand(closeCommand);

        /*
        Opening text file 'file.text'.
        'This is a long text' is inserted.
        'long text' is copied to clipboard.
        'Hello world!' is pasted.
        Closing file 'file.text'.
         */
        textEditorCommandExecutor.invoke();
    }
}
