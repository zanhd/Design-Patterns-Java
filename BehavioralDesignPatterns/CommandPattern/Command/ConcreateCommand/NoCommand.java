package Command.ConcreateCommand;

import Command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        //Doing Nothing : FEEL : Null Design Pattern
    }

    @Override
    public void undo() {
        //Doing Nothing : FEEL : Null Design Pattern
    }
}
