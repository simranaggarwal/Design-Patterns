package com.examples.designpatterns.behavioural.interpreter.expression;

//Information global to Interpreter
public class Context {

    private String context;

    public Context(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
