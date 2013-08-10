package patterns.state.metro;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetroTicketAutoSeller metroTicketAutoSeller = new MetroTicketAutoSeller();
		metroTicketAutoSeller.insertCoin();
		
		metroTicketAutoSeller.selectTicket();
		metroTicketAutoSeller.insertCoin();
		
		metroTicketAutoSeller.selectTicket();
		metroTicketAutoSeller.selectTicket();
		metroTicketAutoSeller.insertCoin();
		
		metroTicketAutoSeller.selectTicket();
		metroTicketAutoSeller.insertCoin();
		
		
	}

}
