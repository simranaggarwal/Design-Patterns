package com.examples.designPatterns.creational.singleton;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

class Show implements Serializable {

    private Set<String> availableSeats;

    /*Approach 1
    Eager Initialization - Guaranteed to be thread safe
    private static final Show SHOW = new Show();
    */

    //Lazy Initialization
    private static Show SHOW;

    /*Approach 2
    This approach is not good for multithreaded environment
    public static Show getInstance() {
        if(SHOW == null) {
            SHOW = new Show();
        }
        return SHOW;
    }*/

    /*Approach 3
    To solve above problem, we use keyword synchronized.
    However, it reduces performance
    public static synchronized Show getInstance() {
        if(SHOW == null) {
            SHOW = new Show();
        }
        return SHOW;
    }*/

    /*Approach 4
    To avoid above problem, we use double-checked locking principle
    Volatile to read and write directly in main memory
    private static volatile Show SHOW;
    public static Show getInstance() {
        if(SHOW == null) {
            synchronized (Show.class) {
                if(SHOW == null) {
                    SHOW = new Show();
                }
            }
        }
        return SHOW;
    }*/

    /*Approach 5
    Bill Pugh Implementation using Inner class
    Old approach that was widely used for Singleton class as it does not require synchronization.
    When the singleton class is loaded, SingletonHelper class is not loaded into memory.
    Only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
    */
    private static class SingletonHelper {
        private static final Show INSTANCE = new Show();
    }
    public static Show getInstance(){
        return SingletonHelper.INSTANCE;
    }

    //Protection from Serialization
    protected Show readResolve() {
        return getInstance();
    }

    private Show() {

        //Prevent from the Reflection.
        if (SHOW != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }

    public Boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}

public class SingletonShow {
    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1B");
    }

    private static void ticketAgentBooks(String seat) {
        Show show = Show.getInstance();
        System.out.println(show.bookSeat(seat));
    }

}
