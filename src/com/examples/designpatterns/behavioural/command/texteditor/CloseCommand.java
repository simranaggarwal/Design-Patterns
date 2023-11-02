package com.examples.designpatterns.behavioural.command.texteditor;

//Concrete Command without Receiver (Receiver is optional)
public class CloseCommand implements Command {
    String fileName;
    public CloseCommand(String fileName) {
        this.fileName = fileName;
    }

    //Implements execute()
    @Override
    public void execute() {
        System.out.println("Closing file '" + fileName + "'.");
    }
}
