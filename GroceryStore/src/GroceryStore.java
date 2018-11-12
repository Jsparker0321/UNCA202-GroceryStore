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
	private int maxItems = gen.nextInt(80) + 1; //A customer will not have more than 80 items
	private int processCart = 3; //Fixed time it takes to scan and bag a single item
	private int shiftDuration;
	private double arrivalProbability = .50;
	

	public GroceryStore(int lines) {
		
		line = new ArrayList<>(lines);
		ArrayDeque<Customer> person;
		
		for (int i = 0; i < lines; i++) {
			
			person =  new ArrayDeque<>();
			line.add(person);
		}
		
		
		
	}

	public void run( int shiftDuration, double arrivalProbability, int processCart, int maxItems) {
		
		
		
		for (int time=0; time < shiftDuration; time++) {
			if (gen.nextDouble() <= arrivalProbability) {
				shortestQueue = getShortestQueue(); 
				shortestQueue.enqueue(Customer);
			}
		}


	}

	public void printData() {
		/**
		 * print: 
		 * (a) the number of time steps run 
		 * (b) the number of lines 
		 * (c) the customer arrival probability 
		 * (d) the time per item 
		 * (e) the maximum number of items 
		 * (f) the maximum length of each queue 
		 * (g) the number of customers left in each queue 
		 * (h) the total number of customers served
		 */
	}
}
