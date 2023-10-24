package com.examples.designpatterns.structural.adaptor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", Arrays.asList("super admin", "admin", "device_read"), true);
        User user2 = new User("user2", Arrays.asList("admin", "device_read", "device_update"), false);
        User user3 = new User("user3", Arrays.asList("super admin", "device create"), true);
        User user4 = new User("user4", Arrays.asList("super admin", "admin", "device_read", "device delete"), false);

        NewToOldAdaptor newToOldAdaptor = new NewToOldAdaptor(new OldImplementation());
        newToOldAdaptor.validateUserAndPermissions(user1);
        newToOldAdaptor.validateUserAndPermissions(user2);
        newToOldAdaptor.validateUserAndPermissions(user3);
        newToOldAdaptor.validateUserAndPermissions(user4);

    }
}
