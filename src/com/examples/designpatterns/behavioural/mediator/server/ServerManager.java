package com.examples.designpatterns.behavioural.mediator.server;

import java.util.List;

//Mediator
public interface ServerManager  {

    public void addServer(Server server);

    public void removeServer(Server server);

    public String getCPUUtilization(String name);

    public String getResponseTime(String name);

    public String getAverageResponseTime();

    public List<String> getUnhealthyHosts();

}
