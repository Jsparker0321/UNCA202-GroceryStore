import java.util.Random;
/**
 * @author Jessica Parker
 * @version October 30, 2018
 * @version A Grocery Store
 * @version CSCI 202
 *
 */
public class Customer {
	
	//Random gen = new Random();	
	//private int maxItems = gen.nextInt(80) + 1; //A customer will not have more than 80 items
	private int groceryItems; //Number of groceries
	private int timeRemaining; //How much time is left
	private int processCart = 3; //Fixed time it takes to scan and bag a single item
	
	public Customer( int groceryItems, int processCart){
		this.groceryItems = groceryItems;
		this.processCart = processCart;
	}
	
	public int getgroceryItems() {
		return groceryItems;
	}
	
	public int gettimeRemaining() {
		return timeRemaining;
	}
	
	public int decreaseTime() {
				
		int totalTime = (getgroceryItems() * processCart);
		int waitingToScan = (getgroceryItems() - 1);
		
		while(waitingToScan > 0 ) {
			
			int cartUpdate = groceryItems--;
			int scannedItems = 0;
			scannedItems++;
			timeRemaining = totalTime - (scannedItems * processCart);
			//int cart = (timeRemaining / processCart);
			
			
			
		}
		return timeRemaining;
		
	}
	 
}
