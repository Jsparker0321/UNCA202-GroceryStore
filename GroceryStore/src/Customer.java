import java.util.Random;
/**
 * @author Jessica Parker
 * @version October 30, 2018
 * @version Project #3: A Grocery Store
 * @version CSCI 202
 * @version attended tutoring
 *
 */
public class Customer {
	
	
	private int groceryItems;
	private int timeRemaining; 
	
	/**
	 * Defining what a customer is
	 * @param groceryItems : representation of the number of grocery items a customer has
	 * @param processCart : representation of the the time remaining until customer's transaction is complete
	 */
	public Customer( int groceryItems, int processCart){
		this.groceryItems = groceryItems;
		this.timeRemaining = processCart * groceryItems;
	
	}
	
	/**
	 * Getter for the amount of groceries 
	 * @return integer value of grocery items
	 */
	public int getgroceryItems() {
		return groceryItems;
	}
	
	/**
	 * Getter for the time remaining
	 * @return integer value of time remaining
	 */
	public int gettimeRemaining() {
		return timeRemaining;
	}
	
	/**
	 * Decrements the time remaining until transaction is complete 
	 */
	public void  decreaseTime() {
		
			this.timeRemaining--;
			
	}
}
