package Invoker;

import Command.Command;
import Command.ConcreateCommand.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public static final int CMD = 2; //for fan + light

    public RemoteControl() {
        onCommands = new Command[CMD];
        offCommands = new Command[CMD];

        Command noCommand = new NoCommand();
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
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
