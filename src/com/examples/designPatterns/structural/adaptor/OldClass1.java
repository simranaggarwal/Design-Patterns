package com.examples.designPatterns.structural.adaptor;

public class OldClass1 implements OldInterface {
    @Override
    public String capitalise(String str) {
        return str.toUpperCase();
    }

    @Override
    public String addPrefix(String str) {
        return "PR-" + str;
    }
}
