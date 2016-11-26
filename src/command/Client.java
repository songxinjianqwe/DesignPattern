package command;

import command.commands.Garage;
import command.commands.GarageDoorCloseCommand;
import command.commands.GarageDoorOpenCommand;
import command.commands.Light;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;

public class Client {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		Garage garage = new Garage();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garage);
		GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garage);
		
		control.setCommand(0, lightOnCommand, lightOffCommand);
		control.setCommand(1, doorOpenCommand, doorCloseCommand);

		System.out.println(control);
		System.out.println();
		
		
		control.onButtonWasPressed(0);
		control.offButtonWasPressed(0);
		
		control.onButtonWasPressed(1);
		control.offButtonWasPressed(1);
		
		control.undoButtonWasPressed();
		
	}
}
