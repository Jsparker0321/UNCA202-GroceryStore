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
	
	public void decreaseTime() {
		int totalTime; //Calculate how long it will take to process the cart
		int itemsLeft; //Calculate how many items are left in the cart
		int time; //Gives how much time is left based on how many items are left in cart
		
		totalTime = (getgroceryItems() * processCart);
		itemsLeft = (totalTime - processCart);
		
		
		while( itemsLeft > 0) {
			time = gettimeRemaining() - itemsLeft;
		}
		
	}
	 
}
