package com.examples.designPatterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

//Composite class implementing component interface
//Contains the tree
public class DirectoryComponent implements FileSystemComponent {

    String directoryName;
    List<FileSystemComponent> children = new ArrayList<>();

    public DirectoryComponent(String directoryName) {
        this.directoryName = directoryName;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying contents of directory: " + directoryName);
        for(FileSystemComponent fileSystemComponent: children) {
            fileSystemComponent.display();
        }
    }
}
