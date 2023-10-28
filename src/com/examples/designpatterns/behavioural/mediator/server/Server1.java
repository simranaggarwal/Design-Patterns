package com.examples.designpatterns.behavioural.mediator.server;

import java.math.BigDecimal;
import java.util.Objects;

//Concrete Colleague
public class Server1 extends Server {

    //Holds a reference to Mediator
    private ServerManager serverManager;
    private String name;

    public Server1(ServerManager serverManager, String name) {
        this.serverManager = serverManager;
        this.name = name;
        serverManager.addServer(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected BigDecimal getCPUUtilization() {
        return BigDecimal.valueOf(40);
    }

    @Override
    protected BigDecimal getResponseTime() {
        return BigDecimal.valueOf(0.4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Server1 server1 = (Server1) o;
        return Objects.equals(name, server1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
