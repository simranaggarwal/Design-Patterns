package com.examples.designpatterns.behavioural.command.texteditor;

//Concrete Command without Receiver (Receiver is optional)
public class OpenCommand implements Command {
    String fileName;
    public OpenCommand(String fileName) {
        this.fileName = fileName;
    }

    //Implements execute()
    @Override
    public void execute() {
        System.out.println("Opening text file '" + fileName + "'.");
    }
}
