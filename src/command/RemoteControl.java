package command;

import command.commands.Command;
import command.commands.NoCommand;

/**
 * Invoker
* @ClassName: SimpleRemoteControl
* @Description: TODO
* @author NewSong
* @date 2016年11月26日 下午4:12:00
*
 */

public class RemoteControl {
	Command[]  onCommands;
	Command[]  offCommands;
	Command unDoCommand;
	
	public RemoteControl() {
		onCommands = new Command[2];
		offCommands = new Command[2];
		Command noCommand = new NoCommand();
		for(int i = 0; i < onCommands.length;++i){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		unDoCommand = noCommand;
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot){
		onCommands[slot].execute();
		unDoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot){
		offCommands[slot].execute();
		unDoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed(){
		unDoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n----Romote Control ----\n");
		for(int i = 0;i < onCommands.length;++i){
			sb.append("[slot "+i+"] " + onCommands[i].getClass().getSimpleName()
					+"     "+offCommands[i].getClass().getSimpleName()+"\n");
			
		}
		return sb.toString();
	}
	
	
	
}
