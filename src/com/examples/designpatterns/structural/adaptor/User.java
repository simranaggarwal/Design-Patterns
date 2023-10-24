package com.examples.designpatterns.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> permissions = new ArrayList<>();
    private Boolean isAccountExpired;

    public User(String name, List<String> permissions, Boolean isAccountExpired) {
        this.name = name;
        this.permissions = permissions;
        this.isAccountExpired = isAccountExpired;
    }

    public String getName() {
        return name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public Boolean getAccountExpired() {
        return isAccountExpired;
    }
}
