import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;


/**
 * 
 */

/**
 * @author Jessica Parker
 * @version October 30, 2018
 * @version A Grocery Store
 * @version CSCI 202
 */


public class GroceryStore {

	ArrayList<Queue> line;
	Random gen = new Random();	
	private int maxItems; //A customer will not have more than 80 items
	private int processCart; //Fixed time it takes to scan and bag a single item
	private int shiftDuration;
	private double arrivalProbability;
	
/**
 * Initializes arraylist and creates a queue of type Customer
 * @param lines : defines the number of lines in the grocery store
 */
	public GroceryStore(int lines) {
		
		line = new ArrayList<>(lines);
		ArrayDeque<Customer> person;
		
		for (int i = 0; i < lines; i++) {
			
			person =  new ArrayDeque<>();
			line.add(person);
		}
		
		
		
	}
	
	/**
	 * Obtains the queues and uses a for loop to decide which queue is the shortest
	 * @return : shortestQueue
	 */
	public Queue getShortestQueue() {
		
		Queue shortestQueue;
		int start = 0;
		
		for (int i = 1; i < line.size(); i++)
			
			if( line.get(start).size() >  line.get(i).size()  )
				start = i;
		
		shortestQueue = line.get(start);
		
		return shortestQueue;
	}

	/**
	 * Creates how the simulation is to run and what things will be needed
	 * @param shiftDuration : how long the simulation is to run
	 * @param arrivalProbability : probability that a customer will arrive within the length of simulation
	 * @param processCart : how long it takes to process (scan & bag) one item 
	 * @param maxItems : Randomly generated number that controls how many grocery items a customer will have
	 */
	public void run( int shiftDuration, double arrivalProbability, int processCart, int maxItems) {
		
		this.shiftDuration = shiftDuration;
		this.maxItems = maxItems; //A customer will not have more than 80 items
		this.processCart = processCart; //Fixed time it takes to scan and bag a single item
		this.arrivalProbability = arrivalProbability;
		Customer one = new Customer(gen.nextInt(maxItems)+1, processCart);
		
		Queue shortestQueue;
		
		for (int time=0; time < shiftDuration; time++) {
			if (gen.nextDouble() <= arrivalProbability) {
				shortestQueue = getShortestQueue(); 
				shortestQueue.add(one);
			}
		}
		
		
		//remove customer
		if (maxItems == 0) {
			shortestQueue.remove();
		}
		//print
		//reset

	}

	/**
	 * Prints out the data to be shown on the console
	 */
	public void printData() {
		  
		 System.out.println("Duration of shift: " + shiftDuration); // (a) the number of time steps run: shiftduration
		 System.out.println("Checkout lines available: " + line );  // (b) the number of lines: lines
		 System.out.println("Probability of a customer arriving: " + arrivalProbability); //(c) the customer arrival probability: arrivalProbability
		 System.out.println("Time it takes to scan and bag an item: " + processCart); //(d) the time per item: processCart
		 System.out.println("Number of items in cart: " + maxItems); //(e) the maximum number of items: maxItems 
		// System.out.println("There are ); //(f) the maximum length of each queue: get length of queue: need a new array declare as global and use for loop
		 //(g) the number of customers left in each queue: get size of queue 
		 //(h) the total number of customers served: new variable and increment
		 
	}
}
