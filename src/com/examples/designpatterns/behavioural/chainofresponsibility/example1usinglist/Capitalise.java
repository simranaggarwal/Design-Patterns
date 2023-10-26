package com.examples.designpatterns.behavioural.chainofresponsibility.example1usinglist;

//Concrete Handler
public class Capitalise implements TextEditor {
    @Override
    public String doFilter(String str) {
        return str.toUpperCase();
    }
}
