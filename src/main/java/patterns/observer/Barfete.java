package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Barfete implements Observer {

	public void update(Observable o, Object arg) {

		if (arg.toString().contains("down")) {
			System.out.println("Barfete: Buy Buy Buy!!!!");
		} else if (arg.toString().contains("raise")) {
			System.out.println("Barfete : Sell Sell Sell!!!!");
		}
		
	}

}
