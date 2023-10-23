package com.examples.designpatterns.structural.bridge.example2;

//Implementation of High Level Interface
//Refined abstraction
public class CrossPlatformFileManager implements FileManager {

    FileSystem fileSystem;

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void openFile(String fileName) {
        fileSystem.openFile(fileName);
    }

    @Override
    public void writeFile(String data) {
        fileSystem.writeFile(data);
    }

    @Override
    public String readFile(String fileName) {
        return fileSystem.readFile(fileName);
    }

    @Override
    public void closeFile(String fileName) {
        fileSystem.closeFile(fileName);
    }
}
