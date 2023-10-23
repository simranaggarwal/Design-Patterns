package com.examples.designPatterns.creational.singleton;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/*
This approach is suggested to overcome the problem of object creation via reflection and serialization.
Also, it is thread-safe
The drawback is that it does not allow lazy initialization.
 */
enum ShowEnum implements Serializable {
    INSTANCE;
    private Set<String> availableSeats;

    private ShowEnum() {
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
    }

    public Boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
public class SingletonEnumShow {

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1B");
    }
    private static void ticketAgentBooks(String seat) {
        ShowEnum showEnum = ShowEnum.INSTANCE;
        System.out.println(showEnum.bookSeat(seat));
    }
}
