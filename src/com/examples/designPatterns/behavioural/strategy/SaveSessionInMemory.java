package com.examples.designPatterns.behavioural.strategy;

import java.util.HashMap;
import java.util.Map;

//Concrete Strategy
public class SaveSessionInMemory implements SessionStrategy {

    Map<String, Object> map = new HashMap<>();

    @Override
    public boolean isAuthenticated(String email) {
        System.out.println("Checking in memory if session is valid.");
        /*
        SessionObject sessionObject = map.get(email)
        isAuthenticated = sessionObject.isValid();
         */
        return true;
    }

    @Override
    public boolean login(String email, String password) {
        System.out.println("Creating new session and saving in memory.");
        /*
        SessionObject sessionObject = new SessionObject(email, password) ;
        map.put(email, sessionObject);
         */
        return true;
    }
}
