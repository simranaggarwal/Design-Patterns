package com.examples.designPatterns.structural.bridge.example1;

//Implementor
public interface ProtocolImplementation {
    void sendData(String data);
    void receiveData(String data);
}
