package com.examples.designpatterns.structural.bridge.example2;

public class Main {
    public static void main(String[] args) {

        CrossPlatformFileManager crossPlatformFileManager = new CrossPlatformFileManager();
        FileSystem linuxFileSystem = new LinuxFileSystem();
        FileSystem windowsFileSystem = new WindowsFileSystem();

        crossPlatformFileManager.setFileSystem(linuxFileSystem);
        //Opening file in Linux system: file.txt
        crossPlatformFileManager.openFile("file.txt");
        //Reading file from Linux system: file.txt
        crossPlatformFileManager.readFile("file.txt");
        //Writing data to Linux system: Hello World!
        crossPlatformFileManager.writeFile("Hello World!");
        //Closing Windows file: file.txt
        crossPlatformFileManager.closeFile("file.txt");

        crossPlatformFileManager.setFileSystem(windowsFileSystem);
        //Opening file in Windows system: file.txt
        crossPlatformFileManager.openFile("file.txt");
        //Reading file from Windows system: file.txt
        crossPlatformFileManager.readFile("file.txt");
        //Writing data to Windows system: Hello World!
        crossPlatformFileManager.writeFile("Hello World!");
        //Closing Windows file: file.txt
        crossPlatformFileManager.closeFile("file.txt");

    }
}
