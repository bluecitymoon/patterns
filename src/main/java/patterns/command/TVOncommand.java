package patterns.command;

public class TVOncommand implements Command {
	private TV tv;
	public void execute() {
		tv.on();
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}

}
