package com.examples.designPatterns.structural.bridge.example2;

//Concrete Implementor, Linux specific file system operations
public class LinuxFileSystem implements FileSystem {
    @Override
    public void openFile(String fileName) {
        System.out.println("Opening file in Linux system: " + fileName);
    }

    @Override
    public void writeFile(String data) {
        System.out.println("Writing data to Linux system: " + data);
    }

    @Override
    public String readFile(String fileName) {
        System.out.println("Reading file from Linux system: " + fileName);
        return "Linux Data: abc";
    }

    @Override
    public void closeFile(String fileName) {
        System.out.println("Closing Windows file: " + fileName);
    }
}
