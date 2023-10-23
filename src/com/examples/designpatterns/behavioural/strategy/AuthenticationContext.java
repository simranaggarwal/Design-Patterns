package com.examples.designpatterns.behavioural.strategy;

public class AuthenticationContext {
    SessionStrategy strategy;

    public void setStrategy(SessionStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isAuthenticated(String email)  {
        return strategy.isAuthenticated(email);
    }

    public boolean login(String email, String password) {
        return strategy.login(email, password);
    }

    public static void main(String[] args) {
        AuthenticationContext authenticationContext = new AuthenticationContext();
        authenticationContext.setStrategy(new SaveSessionInDB());

        String email = "abc@gmail.com";
        String password = "abcPassword"; //Encoded in real life scenarios

        /*
        Creating new session and saving in Database.
        Checking in Database if session is valid.
         */

        authenticationContext.login(email, password);
        authenticationContext.isAuthenticated(email);

        authenticationContext.setStrategy(new SaveSessionInMemory());

        /*
        Creating new session and saving in memory.
        Checking in memory if session is valid.
         */
        authenticationContext.login(email, password);
        authenticationContext.isAuthenticated(email);

    }
}
