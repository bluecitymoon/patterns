package patterns.command;

public class TVController {
	private Command command;
	
	public void buttonWasClicked() {
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
