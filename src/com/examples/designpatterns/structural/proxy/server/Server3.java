package com.examples.designpatterns.structural.proxy.server;

public class Server3 implements Server {
    protected Server3() {
    }
    @Override
    public void processRequest(Request request) {
        System.out.println("Request processing on Server 3");
    }
}
