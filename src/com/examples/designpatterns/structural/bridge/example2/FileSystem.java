package com.examples.designpatterns.structural.bridge.example2;

//Implementor (Low Level Interface)
public interface FileSystem {
    void openFile(String fileName);

    void writeFile(String data);

    String readFile(String fileName);

    void closeFile(String fileName);
}
