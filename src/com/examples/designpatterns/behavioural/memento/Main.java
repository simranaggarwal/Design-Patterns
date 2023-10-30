package com.examples.designpatterns.behavioural.memento;

import com.examples.designpatterns.behavioural.memento.texteditor.TextEditor;
import com.examples.designpatterns.behavioural.memento.texteditor.TextEditorHistory;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory textEditorHistory = new TextEditorHistory();

        //Adding an empty state
        textEditorHistory.save(textEditor);

        textEditor.addContent("Hello\n");
        textEditor.addContent("This is a text editor.\n");
        textEditorHistory.save(textEditor);

        textEditor.addContent("Do you think this text editor is cool?\n");
        textEditorHistory.save(textEditor);

        textEditor.addContent("If yes, thanks! If not, make your own! :) \n");
        textEditorHistory.save(textEditor);

        textEditor.addContent("Regards.\n");
        textEditorHistory.save(textEditor);

        textEditor.display();

        textEditorHistory.undo(textEditor);
        textEditor.display();

        textEditorHistory.undo(textEditor);
        textEditorHistory.undo(textEditor);
        textEditor.display();

        textEditorHistory.redo(textEditor);
        textEditorHistory.redo(textEditor);
        textEditor.display();

        textEditorHistory.redo(textEditor);
        textEditor.display();
    }
}
