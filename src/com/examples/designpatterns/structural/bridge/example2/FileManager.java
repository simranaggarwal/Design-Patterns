package com.examples.designpatterns.structural.bridge.example2;

//Abstraction (High Level Interface)
//Will hold a reference to the Implementor (Low level that user just needs to set but doesn't need to worry about its implementation)
//Core functionality or primary behaviour
public interface FileManager {
    void openFile(String fileName);

    void writeFile(String data);

    String readFile(String fileName);

    void closeFile(String fileName);
}
