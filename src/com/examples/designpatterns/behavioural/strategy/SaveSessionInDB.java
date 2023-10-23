package com.examples.designpatterns.behavioural.strategy;

//Concrete Strategy
public class SaveSessionInDB implements SessionStrategy {
    @Override
    public boolean isAuthenticated(String email) {
        System.out.println("Checking in Database if session is valid.");
        return true;
    }

    @Override
    public boolean login(String email, String password) {
        System.out.println("Creating new session and saving in Database.");
        return true;
    }
}
