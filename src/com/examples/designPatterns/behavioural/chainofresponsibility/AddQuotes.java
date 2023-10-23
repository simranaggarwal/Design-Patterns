package com.examples.designPatterns.behavioural.chainofresponsibility;

//Concrete Handler
public class AddQuotes implements TextEditor {
    @Override
    public String doFilter(String str) {
        return "'" + str + "'";
    }
}
