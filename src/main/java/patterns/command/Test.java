package patterns.command;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TV tv = new TV();
		TVController tvController = new TVController();
		TVOncommand oncommand = new TVOncommand();
		TVOffCommand offCommand = new TVOffCommand();
		oncommand.setTv(tv);
		offCommand.setTv(tv);
		tvController.setCommand(oncommand);
		
		tvController.buttonWasClicked();
		tvController.setCommand(offCommand);
		tvController.buttonWasClicked();
	}

}
