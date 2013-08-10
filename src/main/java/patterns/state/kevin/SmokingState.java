package patterns.state.kevin;


public class SmokingState implements State {

	private SmokingState(){}
	public static SmokingState SMOKING_STATE;
	
	public static SmokingState getInstance() {
		if (SMOKING_STATE == null) {
			SMOKING_STATE = new SmokingState();
		}
		return SMOKING_STATE;
	}
	
	public void smoke() {

		System.out.println("Kavein is smooking happily.");
	}

	public void work() {

		System.out.println("Kavin starts his work after a smoke.");
		System.out.println("Don't let him to work. He is smooking.");
	}

	public void eatingNoodles() {

		
	}

	

}
