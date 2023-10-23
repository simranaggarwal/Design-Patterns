package com.examples.designPatterns.structural.decorator;

//Concrete Component
public class TextEditorImpl implements TextEditor {
    private String str;

    public TextEditorImpl(String str) {
        this.str = str;
    }
    @Override
    public String transformText() {
        return str;
    }
}
