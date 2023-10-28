package com.examples.designpatterns.behavioural.mediator.server;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Concrete Mediator
public class ServerManagerImpl implements ServerManager {

    //Knows and maintains its colleagues
    Map<String, Server> servers = new HashMap<>();

    @Override
    public void addServer(Server server) {
        servers.put(server.getName(), server);
    }

    @Override
    public void removeServer(Server server) {
        servers.remove(server.getName());
    }

    @Override
    public String getCPUUtilization(String name) {
        if(servers.containsKey(name)) {
            return servers.get(name).getName() + " " + servers.get(name).getCPUUtilization() + " percent";
        }
        return "";
    }

    @Override
    public String getResponseTime(String name) {
        if(servers.containsKey(name)) {
            return servers.get(name).getName() + " " + servers.get(name).getResponseTime() + " ms";
        }
        return "";
    }

    @Override
    public String getAverageResponseTime() {
        BigDecimal averageResponseTime = BigDecimal.ZERO;
        for(Server server: servers.values()) {
            averageResponseTime = averageResponseTime.add(server.getResponseTime());
        }
        return "Average Response Time: " + averageResponseTime + " ms";
    }

    @Override
    public List<String> getUnhealthyHosts() {
        List<String> unhealthyHosts = new ArrayList<>();
        for(Server server: servers.values()) {
            if (server.getCPUUtilization().compareTo(BigDecimal.valueOf(80)) > 0) {
                unhealthyHosts.add(server.getName());
            }
        }
        return unhealthyHosts;
    }
}
