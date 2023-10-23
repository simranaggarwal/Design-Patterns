package com.examples.designpatterns.structural.decorator;

//Decorator
public interface TextDecorator extends TextEditor {
    String decorateText(String str);
}
