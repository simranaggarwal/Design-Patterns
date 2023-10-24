package com.examples.designpatterns.structural.proxy;

import com.examples.designpatterns.structural.proxy.server.ProxyServer;
import com.examples.designpatterns.structural.proxy.server.Request;

public class Main {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer();
        for (int i = 0; i < 10; i++) {
            Request request = new Request();
            proxyServer.processRequest(request);
        }
    }
}
