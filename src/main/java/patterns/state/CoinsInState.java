package patterns.state;

public class CoinsInState implements State {

	private AdvancedAutoSeller advancedAutoSeller;
	
	public AdvancedAutoSeller getAdvancedAutoSeller() {
		return advancedAutoSeller;
	}

	public void setAdvancedAutoSeller(AdvancedAutoSeller advancedAutoSeller) {
		this.advancedAutoSeller = advancedAutoSeller;
	}

	public void insertCoins() {

	}

	public void rejectCoins() {
		// TODO Auto-generated method stub

	}

	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

}
