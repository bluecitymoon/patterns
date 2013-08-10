package patterns.state.metro;

public class SoldOutState implements AutoSellerState {

	public void selectTicket(AutoSeller autoSeller) {

		System.out.println("ERROR : Sold Out!");
	}

	public void insertCoin(AutoSeller autoSeller) {
		
		System.out.println("ERROR : Sold Out!");
	}

	public void getTicket(AutoSeller autoSeller) {
		System.out.println("ERROR : Sold Out!");
	}

}
