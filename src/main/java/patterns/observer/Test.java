package patterns.observer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockBoard stockBoard = new StockBoard();
		Barfete barfete = new Barfete();
		Feli feli = new Feli();
		Kavin kavin = new Kavin();
		
		stockBoard.addObserver(barfete);
		stockBoard.addObserver(kavin);
		stockBoard.addObserver(feli);
		
		stockBoard.stockPriceDown();
		System.out.println("--------------------------------------------");
		stockBoard.deleteObserver(feli);
		
		stockBoard.stockPriceUp();
	}

}
