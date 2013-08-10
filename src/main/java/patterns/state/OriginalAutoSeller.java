package patterns.state;

public class OriginalAutoSeller {
	private static  int sell_out = 0;
	private static  int no_conins_in = 1;
	private static  int coins_in = 2;
	private static  int pushing_out_product =3;
	
	private int state = no_conins_in;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OriginalAutoSeller originalAutoSeller = new OriginalAutoSeller();
		originalAutoSeller.insertCoins();
		originalAutoSeller.insertCoins();
		originalAutoSeller.insertCoins();
		originalAutoSeller.rejectCoins();
		originalAutoSeller.rejectCoins();
		originalAutoSeller.rejectCoins();
		
	}
	
	private void insertCoins() {
		if (state == sell_out) {
			System.out.println("Everything is sold out. you can't insert a coin.");
		} else if (state == no_conins_in) {
			System.out.println("Please select things you want.");
			state = coins_in ;
		} else if (state == coins_in) {
			System.out.println("Please select things you want.");
		} else if (state == pushing_out_product) {
			System.out.println("Your product is pushing out, please wait");
		}
	}
	
	private void rejectCoins() {
		if (state == sell_out) {
			System.out.println("No coins to reject.");
		} else if (state == no_conins_in) {
			System.out.println("No coins to reject.");
		} else if (state == coins_in) {
			state = no_conins_in;
			System.out.println("Please take your coins.");
		} else if (state == pushing_out_product) {
			System.out.println("Your product is pushing out, you can't reject a coin.");
		}
		
	}
	
	private void turnCrank() {
		
	}
	
	private void dispense() {
		
	}

}
