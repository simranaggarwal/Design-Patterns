package com.examples.designPatterns.structural.bridge.example1;

//Implementation of High Level Interface
//Refined abstraction
public class SecuredNetworkProtocol implements NetworkProtocol {

    ProtocolImplementation protocolImplementation;

    public SecuredNetworkProtocol(ProtocolImplementation protocolImplementation) {
        this.protocolImplementation = protocolImplementation;
    }

    @Override
    public void sendData(String data) {
        data = encrypt(data);
        protocolImplementation.sendData(data);
    }

    @Override
    public void receiveData(String data) {
        protocolImplementation.receiveData(data);
        data = decrypt(data);
    }

    //Other useful methods needed in Abstraction
    public String encrypt(String data){
        System.out.println("Encrypting data");
        return data;
    }

    public String decrypt(String data) {
        System.out.println("Decrypting data");
        return data;
    }
}
