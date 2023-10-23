package com.examples.designpatterns.behavioural.chainofresponsibility;

//Concrete Handler
public class Capitalise implements TextEditor {
    @Override
    public String doFilter(String str) {
        return str.toUpperCase();
    }
}
