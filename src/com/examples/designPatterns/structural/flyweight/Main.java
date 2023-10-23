package com.examples.designPatterns.structural.flyweight;

import com.examples.designPatterns.structural.flyweight.dictionary.DictionaryFactory;
import com.examples.designPatterns.structural.flyweight.dictionary.DictionaryObject;

public class Main {
    public static void main(String[] args) {
        DictionaryObject dictionaryObject1 = DictionaryFactory.getDictionaryFactory().getDescription("accept");
        DictionaryObject dictionaryObject2 = DictionaryFactory.getDictionaryFactory().getDescription("except");
        DictionaryObject dictionaryObject3 = DictionaryFactory.getDictionaryFactory().getDescription("expect");

        //Same as dictionaryObject2
        DictionaryObject dictionaryObject4 = DictionaryFactory.getDictionaryFactory().getDescription("except");

        System.out.println();
        /*
        D1: com.examples.designPatterns.structural.flyweight.dictionary.DictionaryObject@6d311334
        D2: com.examples.designPatterns.structural.flyweight.dictionary.DictionaryObject@682a0b20
        D3: com.examples.designPatterns.structural.flyweight.dictionary.DictionaryObject@3d075dc0
        D4: com.examples.designPatterns.structural.flyweight.dictionary.DictionaryObject@682a0b20
         */
        System.out.println("D1: " + dictionaryObject1 + "\nD2: " + dictionaryObject2 + "\nD3: " + dictionaryObject3 + "\nD4: " + dictionaryObject4);

    }
}
