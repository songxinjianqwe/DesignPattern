package command.commands;

public class GarageDoorOpenCommand implements Command {
	private Garage garage;
	public GarageDoorOpenCommand(Garage garage) {
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		garage.on();
	}

	@Override
	public void undo() {
		garage.off();
	}

}
