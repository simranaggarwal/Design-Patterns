package com.examples.designpatterns.structural.adaptor;

//Adapter
public class NewToOldAdaptor implements NewInterface {
    OldInterface oldInterface;

    public NewToOldAdaptor(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    public void validateUserAndPermissions(User user) {
        oldInterface.validateUser(user);
        oldInterface.validatePermissions(user);
    }
}
