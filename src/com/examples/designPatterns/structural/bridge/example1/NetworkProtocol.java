package com.examples.designPatterns.structural.bridge.example1;

//Abstraction (High Level Interface)
//Will hold a reference to the Implementor (Low level, users don't need to worry about its implementation)
//Core functionality or primary behaviour
public interface NetworkProtocol {
    void sendData(String data);
    void receiveData(String data);
}
