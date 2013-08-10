package patterns.state;

public interface State {

//	public void handle();
	
	public void insertCoins();
	
	public void rejectCoins() ;
	
	public void turnCrank();
	
	public void dispense();
}
