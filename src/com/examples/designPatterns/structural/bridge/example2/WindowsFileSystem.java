package com.examples.designPatterns.structural.bridge.example2;

//Concrete Implementor, Windows specific file system operations
public class WindowsFileSystem implements FileSystem {
    @Override
    public void openFile(String fileName) {
        System.out.println("Opening file in Windows system: " + fileName);
    }

    @Override
    public void writeFile(String data) {
        System.out.println("Writing data to Windows system: " + data);
    }

    @Override
    public String readFile(String fileName) {
        System.out.println("Reading file from Windows system: " + fileName);
        return "Windows Data: abc";
    }

    @Override
    public void closeFile(String fileName) {
        System.out.println("Closing Windows file: " + fileName);
    }
}
