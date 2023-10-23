package com.examples.designPatterns.behavioural.strategy;

public interface SessionStrategy {
    public boolean isAuthenticated(String email);

    public boolean login(String email, String password);

}
