package patterns.command;

import java.io.Serializable;
import java.util.concurrent.Callable;

public class TVOffCommand implements Command, Serializable {
	private TV tv;
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.off();
	}

}
