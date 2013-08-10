package patterns.state.metro;

/**
 * Here is bad example.
 * 
 * The state of the machine is :
 * on sell -> ticket selected -> paid -> ticket out -> on sell 
 * 
 * @author jerryjiang
 *
 */
public class MetroTicketAutoSeller {

	private static int on_sell = 0;
	
	private static int ticket_select = 2;
	
	private static int sell_out = 1;
	
//	private static int machine_broken = 3;
	
	private int currentState = on_sell;
	
	private int numberOfTickets = 2;
	
	public void selectTicket() {
	//	if( currentState != machine_broken) {
		if (currentState == on_sell) {
			System.out.println("You have select a ticket. Good.");
			currentState = ticket_select;
		} else if (currentState == ticket_select) {
			System.out.println("You select your ticket again. Good.");
		} else if (currentState == sell_out){
			System.out.println("The ticket has been sold out.");
		}
//		} else {
//			System.out.println("Machine is broken.");
//		}
		
	}
	
	public void insertCoin() {
		if (currentState == on_sell) {
			System.out.println("Please select your ticket.");
		} else if (currentState == ticket_select) {
			System.out.println("Please take your ticket.");
			currentState = on_sell;
			numberOfTickets --;
			
			if (numberOfTickets ==0) {
				currentState = sell_out;
			}
		} else if (currentState == sell_out){
			System.out.println("The ticket has been sold out.");
		}
	}
//	
//	public void destory() {
//		currentState = machine_broken;
//	}
	
}
