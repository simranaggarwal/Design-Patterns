package com.examples.designpatterns.structural.adaptor;

import java.util.List;

public class OldImplementation implements OldInterface {
    @Override
    public void validateUser(User user) {
        if(user.getAccountExpired()) {
            System.out.println("Expired Account: " + user.getName());
        } else {
            System.out.println("User is active: " + user.getName());
        }
    }

    @Override
    public void validatePermissions(User user) {
        Boolean isAuthorized = false;
        List<String> permissions = user.getPermissions();
        for(String permission: permissions) {
            if(permission.equals("admin")) {
                isAuthorized = true;
            }
        }
        if(isAuthorized) {
            System.out.println("Authorized user: " + user.getName());
        } else {
            System.out.println("Unauthorized user: " + user.getName());
        }
    }
}
