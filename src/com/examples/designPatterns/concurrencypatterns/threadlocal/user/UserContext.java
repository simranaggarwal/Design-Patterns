package com.examples.designPatterns.concurrencypatterns.threadlocal.user;

import java.util.HashMap;
import java.util.Map;

//In memory repository of Users
public class UserContext {
    private Map<String, User> map = new HashMap<>();

    public User get(String key){
        return map.get(key);
    }
    void put(User user) {
        map.put(user.email, user);
    }

}
