package com.examples.designpatterns.behavioural.chainofresponsibility;

//Concrete Handler
public class Transform implements TextEditor {
    @Override
    public String doFilter(String str) {
        //Making text bold
        return  "\u001B[1m" + str + "\u001B[0m";
    }
}
