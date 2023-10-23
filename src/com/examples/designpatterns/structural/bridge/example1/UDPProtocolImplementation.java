package com.examples.designpatterns.structural.bridge.example1;

//Concrete Implementor
public class UDPProtocolImplementation implements ProtocolImplementation {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data over UDP Protocol");
    }

    @Override
    public void receiveData(String data) {
        System.out.println("Receiving data over UDP Protocol");
    }
}
