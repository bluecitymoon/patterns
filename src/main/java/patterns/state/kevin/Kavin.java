package patterns.state.kevin;

/**
 * Kevin is a big people.
 * 
 * @author jerryjiang
 *
 */
public class Kavin {
	
	/**
	 * Kevin's state. can be changed at any time.
	 */
	private State state;
	
	private static Kavin kavin;
	private Kavin() {
		super();
		state = new NoState();
	}
	
	public static Kavin getInstance() {
		if (null == kavin) 
		{
			kavin = new Kavin();
		}
		
		return kavin;
	}

	/**
	 * kavin's state changed.
	 * 
	 * @param state
	 */
	public void goToState(State state) {
		this.state = state;
	}
	
	/**
	 * smoke
	 */
	public void smoke() {
		state.smoke();
	}
	
	/**
	 * work
	 */
	public void work() {
		state.work();
	}
	
	/**
	 * eating noodles.
	 */
	public void eatingNoodles() {
		state.eatingNoodles();
	}
}
