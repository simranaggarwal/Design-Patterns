package com.examples.designpatterns.structural.proxy.server;

//Proxy
public class ProxyServer implements Server {

    protected Server server;

    @Override
    public void processRequest(Request request) {
        setServer();
        server.processRequest(request);
    }
    private void setServer() {
        int random = (int) ((Math.random()*100)%3);
        if(random == 1) {
            this.server = new Server1();
        } else if(random == 2) {
            this.server = new Server2();
        } else {
            this.server = new Server3();
        }
    }
}
