package Invoker;

import Command.Command;
import Command.ConcreateCommand.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    public static final int CMD = 2; //for fan + light
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[CMD];
        offCommands = new Command[CMD];

        Command noCommand = new NoCommand();
        undoCommand = noCommand;
        for(int i = 0; i < CMD; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
