package com.examples.designpatterns.behavioural.command.texteditor;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class TextEditorCommandExecutor {
    List<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void invoke() {
        for(Command command: commands) {
            command.execute();
        }
    }
}
