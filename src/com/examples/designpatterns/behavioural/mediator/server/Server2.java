package com.examples.designpatterns.behavioural.mediator.server;

import java.math.BigDecimal;
import java.util.Objects;

//Concrete Colleague
public class Server2 extends Server {
    private String name;

    ServerManager serverManager;

    public Server2(ServerManager serverManager, String name) {
        this.name = name;
        this.serverManager = serverManager;
        serverManager.addServer(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected BigDecimal getCPUUtilization() {
        return BigDecimal.valueOf(90);
    }

    @Override
    protected BigDecimal getResponseTime() {
        return BigDecimal.valueOf(1.9);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Server2 server2 = (Server2) o;
        return Objects.equals(name, server2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
