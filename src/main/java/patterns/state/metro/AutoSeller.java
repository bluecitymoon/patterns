package patterns.state.metro;

public class AutoSeller {

	private AutoSellerState autoSellerState;
	
	public WaitingForSelectTicketState waitingForSelectTicketState;
	public TicketSelectedState ticketSelectedState;
	public PaidState paidState;
	public SoldOutState soldOutState;
	
	private  int count;
	
	public AutoSeller() {
		super();
		waitingForSelectTicketState = new WaitingForSelectTicketState();
		ticketSelectedState = new TicketSelectedState();
		paidState = new PaidState();
		soldOutState = new SoldOutState();
		
		setAutoSellerState(waitingForSelectTicketState);
	}

	public void selectTicket() {
		autoSellerState.selectTicket(this);
	}

	public void insertCoin() {

		autoSellerState.insertCoin(this);
	}
	
	public void getMyTicket() {
		autoSellerState.getTicket(this);
	}

	public AutoSellerState getAutoSellerState() {
		return autoSellerState;
	}

	public void setAutoSellerState(AutoSellerState autoSellerState) {
		this.autoSellerState = autoSellerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}
