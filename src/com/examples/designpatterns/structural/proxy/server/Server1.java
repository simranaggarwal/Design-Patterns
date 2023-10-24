package com.examples.designpatterns.structural.proxy.server;

//Real Subject
public class Server1 implements Server {

    protected Server1() {
    }

    @Override
    public void processRequest(Request request) {
        System.out.println("Request processing on Server 1");
    }
}
