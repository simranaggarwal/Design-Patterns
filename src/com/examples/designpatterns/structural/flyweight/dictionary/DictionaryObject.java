package com.examples.designpatterns.structural.flyweight.dictionary;

//Concrete Flyweight Object
public class DictionaryObject {
    String word;
    String description;

    DictionaryObject(String word, String description) {
        this.word = word;
        this.description = description;
    }
}
