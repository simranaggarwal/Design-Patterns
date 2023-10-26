package com.examples.designpatterns.behavioural.chainofresponsibility.example1usinglist;

//Concrete Handler
public class AddQuotes implements TextEditor {
    @Override
    public String doFilter(String str) {
        return "'" + str + "'";
    }
}
