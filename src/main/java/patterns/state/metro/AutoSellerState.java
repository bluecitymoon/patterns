package patterns.state.metro;

public interface AutoSellerState {

	//public AutoSellerState getInstance();
	public void selectTicket(AutoSeller autoSeller);
	public void insertCoin(AutoSeller autoSeller);
	public void getTicket(AutoSeller autoSeller);
}
