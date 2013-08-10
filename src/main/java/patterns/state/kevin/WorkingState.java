package patterns.state.kevin;


public class WorkingState implements State {
	
	private Kavin kavin;
	

	public Kavin getKavin() {
		return kavin;
	}

	public void setKavin(Kavin kavin) {
		this.kavin = kavin;
	}

	public void smoke() {
		System.out.println("Boss said, Kavin is limit to smoke while working.");
	}

	public void work() {
		
		System.out.println("Kevin is hard working.");
		kavin.goToState(SmokingState.getInstance());
		
	}

	public void eatingNoodles() {
		
	}

}
