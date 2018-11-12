import java.util.Random;
/**
 * @author Jessica Parker
 * @version October 30, 2018
 * @version A Grocery Store
 * @version CSCI 202
 *
 */
public class Customer {
	
	
	private int groceryItems; //Number of groceries
	private int timeRemaining; //How much time is left
	
	
	public Customer( int groceryItems, int processCart){
		this.groceryItems = groceryItems;
		this.timeRemaining = processCart * groceryItems;
	
	}
	
	public int getgroceryItems() {
		return groceryItems;
	}
	
	public int gettimeRemaining() {
		return timeRemaining;
	}
	
	public void  decreaseTime() {
				
		
			this.timeRemaining--;
			
	}
}
