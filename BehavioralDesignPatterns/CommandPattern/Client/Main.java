package Client;

import Command.ConcreateCommand.CommandForFan.FanOffCommand;
import Command.ConcreateCommand.CommandForFan.FanOnCommand;
import Command.ConcreateCommand.CommandForLight.LightOffCommand;
import Command.ConcreateCommand.CommandForLight.LightOnCommand;
import Invoker.RemoteControl;
import Invoker.RemoteControlWithUndo;
import Receiver.Fan;
import Receiver.Light;

public class Main {

    public static void usingRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();

        Light roomLight = new Light();
        Fan roomFan = new Fan();

        //setting up remote-Control-button-slots
        remoteControl.setCommand(0, new LightOnCommand(roomLight), new LightOffCommand(roomLight));
        remoteControl.setCommand(1, new FanOnCommand(roomFan), new FanOffCommand(roomFan));

        //pressing button in slots : executing

        //turning on light + fan
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        //turning off light + fan
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
    }

    public static void usingRemoteControlWithUndo() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light roomLight = new Light();
        Fan roomFan = new Fan();

        //setting up remote-Control-button-slots
        remoteControl.setCommand(0, new LightOnCommand(roomLight), new LightOffCommand(roomLight));
        remoteControl.setCommand(1, new FanOnCommand(roomFan), new FanOffCommand(roomFan));

        //pressing button in slots : executing

        //turning on light + fan
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        //turning off light + fan
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);

        //Undo the Off operation
        remoteControl.undoButtonWasPushed();
    }

    public static void main(String[] args) {
        usingRemoteControl();
        System.out.println("---------------");
        usingRemoteControlWithUndo();
    }
}

/*
OUTPUT :
Light is ON
Fan is ON
Light is OFF
Fan is OFF
---------------
Light is ON
Fan is ON
Light is OFF
Fan is OFF
Fan is ON  //<- due to undo-operation
 */