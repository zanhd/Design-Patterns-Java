package Command.ConcreateCommand.CommandForFan;

import Command.Command;
import Receiver.Fan;

public class FanOffCommand implements Command {
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }

    @Override
    public void undo() {
        fan.turnOn();
    }

}
