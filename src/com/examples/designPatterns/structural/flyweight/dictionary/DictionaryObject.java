package com.examples.designPatterns.structural.flyweight.dictionary;

//Concrete Flyweight Object
public class DictionaryObject {
    String word;
    String description;

    DictionaryObject(String word, String description) {
        this.word = word;
        this.description = description;
    }
}
