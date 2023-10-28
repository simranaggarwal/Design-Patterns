package com.examples.designpatterns.behavioural.mediator.server;

import java.math.BigDecimal;

//Colleague
public abstract class Server {
    public abstract String getName();

    protected abstract BigDecimal getCPUUtilization();

    protected abstract BigDecimal getResponseTime();
}
