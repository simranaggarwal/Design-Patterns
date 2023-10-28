package com.examples.designpatterns.behavioural.mediator;

import com.examples.designpatterns.behavioural.mediator.server.*;

public class Main {
    public static void main(String[] args) {
        ServerManager serverManager = new ServerManagerImpl();

        Server server1 = new Server1(serverManager, "t2.large");
        Server server2 = new Server2(serverManager, "t2.small");
        Server server3 = new Server3(serverManager, "t2.medium");

        /*
        t2.large 0.4 ms
        t2.small 1.9 ms
        t2.medium 0.8 ms
        Average Response Time: 3.1 ms
        Unhealthy hosts: [t2.small]
         */
        System.out.println(serverManager.getResponseTime(server1.getName()));
        System.out.println(serverManager.getResponseTime(server2.getName()));
        System.out.println(serverManager.getResponseTime(server3.getName()));
        System.out.println(serverManager.getAverageResponseTime());
        System.out.println("Unhealthy hosts: " + serverManager.getUnhealthyHosts());
    }
}
