package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Feli implements Observer {

	public void update(Observable o, Object arg) {
		if (arg.toString().contains("down")) {
			System.out.println("Feli : Buy Buy Buy Buy Buy!!!!!!!!!!!!!!!!!");
		}  else if (arg.toString().contains("raise")) {
			System.out.println("Feli : Hold...");
		}
	}

}
