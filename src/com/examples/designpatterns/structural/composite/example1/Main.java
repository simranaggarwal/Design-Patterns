package com.examples.designpatterns.structural.composite.example1;

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new FileComponent("file1.txt");
        //Displaying contents of file: file1.txt
        file1.display();

        DirectoryComponent rootDirectoryComponent = new DirectoryComponent("root");
        DirectoryComponent childrenDirectoryComponent = new DirectoryComponent("child-dir");

        rootDirectoryComponent.addComponent(childrenDirectoryComponent);
        FileComponent file2 = new FileComponent("file2.txt");
        childrenDirectoryComponent.addComponent(file2);
        FileComponent file3 = new FileComponent("file3.txt");
        rootDirectoryComponent.addComponent(file3);

        System.out.println();
        /*
        Displaying contents of directory: root
        Displaying contents of directory: child-dir
        Displaying contents of file: file2.txt
        Displaying contents of file: file3.txt
         */
        rootDirectoryComponent.display();
    }
}
