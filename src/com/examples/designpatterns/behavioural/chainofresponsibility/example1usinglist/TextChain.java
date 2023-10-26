package com.examples.designpatterns.behavioural.chainofresponsibility.example1usinglist;

import java.util.ArrayList;
import java.util.List;

public class TextChain {

    //List of handlers, Can be a linked list as well
    List<TextEditor> textEditors = new ArrayList<>();

    public void addEditors(TextEditor textEditor) {
        textEditors.add(textEditor);
    }

    public void doFilters(String text) {
        for(TextEditor textEditor: textEditors) {
            text = textEditor.doFilter(text);
            System.out.println(text);
        }
    }

}
