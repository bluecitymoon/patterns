package patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class StockBoard extends Observable{

	/**
	 * 
	 */
	public void stockPriceDown() {
		setChanged();
		notifyObservers("Apple stock price down.");
	}
	
	public void stockPriceUp() {
		setChanged();
		notifyObservers("The price of Ericsson stock raises sharply.");
	}

	@Override
	public void notifyObservers(Object arg) {
		
	}
	
	
}
