package command.commands;

public class GarageDoorCloseCommand implements Command {

	private Garage garage;

	public GarageDoorCloseCommand(Garage garage) {
		this.garage = garage;
	}

	@Override
	public void execute() {
		garage.off();
	}

	@Override
	public void undo() {
		garage.on();
	}
}
