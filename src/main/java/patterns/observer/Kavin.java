package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Kavin implements Observer {

	public void update(Observable o, Object arg) {

		if (arg.toString().contains("down")) {
			System.out.println("Kevin : Oh ~~~ I don't want to buy...");
		} else if (arg.toString().contains("raise")) {
			System.out.println("Kevin : Oh ~~~ FaCai Facai!! Buy BUy Buy!!");
		}
	}

}
