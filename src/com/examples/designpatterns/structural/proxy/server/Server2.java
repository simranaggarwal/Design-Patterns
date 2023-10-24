package com.examples.designpatterns.structural.proxy.server;

//Real Subject
public class Server2 implements Server {
    protected Server2() {
    }
    @Override
    public void processRequest(Request request) {
        System.out.println("Request processing on Server 2");
    }
}
