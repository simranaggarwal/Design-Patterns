package com.examples.designPatterns.concurrencypatterns.threadlocal.user;

import java.util.List;

public class User {
    String email;
    List<String> permissions;

    public User(String email, List<String> permissions) {
        this.email = email;
        this.permissions = permissions;
        UserContextManager.getContext().put(this);
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
