package com.examples.designpatterns.structural.bridge.example1;

public class Main {
    public static void main(String[] args) {
        ProtocolImplementation tcpProtocol = new TCPProtocolImplementation();
        NetworkProtocol securedNetworkProtocol = new SecuredNetworkProtocol(tcpProtocol);

        /*
        Encrypting data
        Sending data over TCP Protocol
         */
        securedNetworkProtocol.sendData("Important data");
        /*
        Receiving data over TCP Protocol
        Decrypting data
         */
        securedNetworkProtocol.receiveData("Important data");

        System.out.println();

        ProtocolImplementation udpProtocol = new UDPProtocolImplementation();
        NetworkProtocol anotherSecuredNetworkProtocol = new SecuredNetworkProtocol(udpProtocol);

        /*
        Encrypting data
        Sending data over UDP Protocol
         */
        anotherSecuredNetworkProtocol.sendData("Important data");
        /*
        Receiving data over UDP Protocol
        Decrypting data
         */
        anotherSecuredNetworkProtocol.receiveData("Important data");

    }
}
