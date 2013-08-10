package patterns.command;

public class TVPlayCommand implements Command {

	private TV tv ;
	
	
	public TV getTv() {
		return tv;
	}


	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.display();

	}

}
