package com.examples.designpatterns.behavioural.memento.texteditor;

//Memento, state of the originator
public class TextEditorMemento {
    private StringBuilder content;

    TextEditorMemento(StringBuilder content) {
        this.content = content;
    }

    StringBuilder getContent() {
        return content;
    }
}
