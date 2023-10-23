package com.examples.designpatterns.behavioural.strategy;

public interface SessionStrategy {
    public boolean isAuthenticated(String email);

    public boolean login(String email, String password);

}
