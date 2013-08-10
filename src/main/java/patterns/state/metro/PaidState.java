package patterns.state.metro;

public class PaidState implements AutoSellerState {

	public void selectTicket(AutoSeller autoSeller) {
		autoSeller.setAutoSellerState(autoSeller.ticketSelectedState);
		System.out.println("INFO : You select a ticket.");
	}

	public void insertCoin(AutoSeller autoSeller) {
		System.out.println(" ERROR : Please insert coins.");
	}

	public void getTicket(AutoSeller autoSeller) {

		System.out.println("GOOD : you got your ticket.");
		int count = autoSeller.getCount();
		if (count == 1) {
			autoSeller.setAutoSellerState(autoSeller.soldOutState);
			System.out.println("Warnning : ticket is sold out.");
		} else {
			autoSeller.setCount(count - 1);
			autoSeller.setAutoSellerState(autoSeller.waitingForSelectTicketState);
		}
	}

}
