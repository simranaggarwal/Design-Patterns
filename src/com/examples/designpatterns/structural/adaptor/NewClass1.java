package com.examples.designpatterns.structural.adaptor;

//Target
//Couldn't think of any example better than that
public class NewClass1 {

    NewToOldAdaptor newToOldAdaptor;

    public NewClass1(NewToOldAdaptor newToOldAdaptor) {
        this.newToOldAdaptor = newToOldAdaptor;
    }

    public String capitaliseAndAddPrefix(String str) {
        return newToOldAdaptor.capitaliseAndAddPrefix(str);
    }

    public static void main(String[] args) {
        NewClass1 newClass1 = new NewClass1(new NewToOldAdaptor(new OldClass1()));
        //PR-HELLO WORLD!
        System.out.println(newClass1.capitaliseAndAddPrefix("Hello World!"));
    }
}
