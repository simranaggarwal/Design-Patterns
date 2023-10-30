package com.examples.designpatterns.behavioural.memento.texteditor;

import java.util.ArrayList;
import java.util.List;

//CareTaker
public class TextEditorHistory {

    //Responsible for the memento's safekeeping.
    private List<TextEditorMemento> textEditorHistory = new ArrayList<>();

    private int cursor = -1;

    public void save(TextEditor textEditor) {
        TextEditorMemento memento = textEditor.save();
        cursor = cursor + 1;
        textEditorHistory.add(memento);
    }


    public void undo(TextEditor textEditor) {
        if(cursor != 0 && textEditorHistory.size() != 0) {
            cursor = cursor - 1;
            //Caretaker never operates on or examines the contents of a memento.
            textEditor.restore(textEditorHistory.get(cursor));
        }
    }

    public void redo(TextEditor textEditor) {
        if(cursor < textEditorHistory.size() - 1) {
            cursor = cursor + 1;
            //Caretaker never operates on or examines the contents of a memento.
            textEditor.restore(textEditorHistory.get(cursor));
        }
    }

}
