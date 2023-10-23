package com.examples.designPatterns.structural.decorator;

//Decorator
public interface TextDecorator extends TextEditor {
    String decorateText(String str);
}
