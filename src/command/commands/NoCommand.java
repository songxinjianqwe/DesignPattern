package command.commands;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("No Action");
	}

	@Override
	public void undo() {
		System.out.println("No Action");
	}

}
