package com.examples.designPatterns.structural.flyweight.dictionary;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//FlyweightFactory
public class DictionaryFactory {

    private static final DictionaryFactory dictionaryFactory = new DictionaryFactory();

    private Map<String, DictionaryObject> dictionaryMap = new ConcurrentHashMap<>();

    public static DictionaryFactory getDictionaryFactory() {
        return dictionaryFactory;
    }

    public DictionaryObject getDescription(String word) {
        String key = word.toLowerCase();
        if(dictionaryMap.containsKey(key)) {
            //Returning existing object
            return dictionaryMap.get(key);
        } else {
            //Fetched from some public API
            String description = "Description of " + key;
            dictionaryMap.computeIfAbsent(key, dict -> new DictionaryObject(key, description));
            //Returning newly created object
            return dictionaryMap.get(key);
        }
    }
}
