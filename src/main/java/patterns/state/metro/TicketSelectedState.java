package patterns.state.metro;

public class TicketSelectedState implements AutoSellerState {

	public void selectTicket(AutoSeller autoSeller) {

		System.out.println("INFO : you have select a ticket again.");
	}

	public void insertCoin(AutoSeller autoSeller) {
		System.out.println("INFO : you insert some coins.");
		
		autoSeller.setAutoSellerState(autoSeller.paidState);
		

	}

	public void getTicket(AutoSeller autoSeller) {
		System.out.println("ERROR : please insert enough coins.");
	}

}
