package patterns.state.metro;

public class NewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//select -> paid -> got ticket
		AutoSeller autoSeller = new AutoSeller();
		autoSeller.setCount(2);
		autoSeller.selectTicket();
		autoSeller.insertCoin();
		autoSeller.getMyTicket();
		
		autoSeller.selectTicket();
		autoSeller.insertCoin();
		autoSeller.getMyTicket();
		
		
		autoSeller.getMyTicket();
		
		autoSeller.insertCoin();
		
		autoSeller.selectTicket();
		autoSeller.getMyTicket();

		autoSeller.insertCoin();
		
		autoSeller.selectTicket();
		autoSeller.insertCoin();
		autoSeller.getMyTicket();
		
		
		autoSeller.selectTicket();
		autoSeller.insertCoin();
		autoSeller.getMyTicket();
	}

}
