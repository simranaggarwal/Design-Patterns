package com.examples.designpatterns.structural.adaptor;

//Adapter
public class NewToOldAdaptor {
    OldInterface oldInterface;

    public NewToOldAdaptor(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    public String capitaliseAndAddPrefix(String str) {
        str = oldInterface.capitalise(str);
        str = oldInterface.addPrefix(str);
        return str;
    }
}
