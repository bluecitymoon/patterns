package patterns.state.metro;

public class WaitingForSelectTicketState implements AutoSellerState {

	public void selectTicket(AutoSeller autoSeller) {

		System.out.println("INFO : you select a ticket.");
		autoSeller.setAutoSellerState(autoSeller.ticketSelectedState);
	}

	public void insertCoin(AutoSeller autoSeller) {
		System.out.println("ERROR : Please select a ticket first");
	}

	public void getTicket(AutoSeller autoSeller) {

		System.out.println("ERROR : Please select a ticket");
	}

}
