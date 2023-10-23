package com.examples.designPatterns.concurrencydesignpatterns.threadlocal;

import com.examples.designPatterns.concurrencydesignpatterns.threadlocal.user.User;
import com.examples.designPatterns.concurrencydesignpatterns.threadlocal.user.UserContextManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", Arrays.asList("super admin", "admin", "device_read"));
        User user2 = new User("user2", Arrays.asList("admin", "device_read", "device_update"));
        User user3 = new User("user1", Arrays.asList("super admin", "device create"));
        User user4 = new User("user1", Arrays.asList("super admin", "admin", "device_read", "device delete"));

        //User{email='user2', permissions=[admin, device_read, device_update]}
        System.out.println(UserContextManager.getContext().get(user2.getEmail()));

        //User{email='user1', permissions=[super admin, admin, device_read, device delete]}
        System.out.println(UserContextManager.getContext().get(user3.getEmail()));

    }
}
