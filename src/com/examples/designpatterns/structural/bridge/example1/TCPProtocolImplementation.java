package com.examples.designpatterns.structural.bridge.example1;

//Concrete Implementor
public class TCPProtocolImplementation implements ProtocolImplementation {
    @Override
    public void sendData(String data) {
        System.out.println("Sending data over TCP Protocol");
    }

    @Override
    public void receiveData(String data) {
        System.out.println("Receiving data over TCP Protocol");
    }
}
