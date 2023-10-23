package com.examples.designPatterns.structural.composite.example1;

//Leaf of the tree structure
public class FileComponent implements FileSystemComponent {

    String fileName;

    public FileComponent(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying contents of file: " + fileName);
    }
}
