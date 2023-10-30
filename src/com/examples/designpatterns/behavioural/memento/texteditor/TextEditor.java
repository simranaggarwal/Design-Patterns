package com.examples.designpatterns.behavioural.memento.texteditor;

//Originator
public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void addContent(String content) {
        this.content.append(content);
    }

    //Creates a memento containing snapshot of its current internal state.
    protected TextEditorMemento save() {
        return new TextEditorMemento(new StringBuilder(this.content));
    }

    //Uses the memento to restore its internal state
    protected void restore(TextEditorMemento memento) {
        StringBuilder content = new StringBuilder();
        content.append(memento.getContent());
        this.content = content;
    }

    public void display() {
        System.out.println(content);
    }

}
