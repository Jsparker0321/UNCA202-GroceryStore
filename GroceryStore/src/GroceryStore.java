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
 * @version attended tutoring
 */

public class GroceryStore {

	ArrayList<Queue> line;
	Random gen = new Random();
	private int maxItems; 
	private int processCart; 
	private int shiftDuration;
	private double arrivalProbability;
	private int customersServed = 0;
	private int[] maxLength;

	/**
	 * Initializes arraylist and creates a queue of type Customer
	 * 
	 * @param lines : defines the number of lines in the grocery store
	 */
	public GroceryStore(int lines) {

		line = new ArrayList<>(lines);
		ArrayDeque<Customer> person;

		for (int i = 0; i < lines; i++) {

			person = new ArrayDeque<>();
			line.add(person);
		}
		
		maxLength = new int[lines];
	}

	/**
	 * Obtains the queues and uses a for loop to decide which queue is the shortest
	 * 
	 * @return : shortestQueue
	 */
	public Queue getShortestQueue() {

		Queue shortestQueue;
		int start = 0;

		for (int i = 1; i < line.size(); i++)

			if (line.get(start).size() > line.get(i).size())
				start = i;

		shortestQueue = line.get(start);

		return shortestQueue;
	}

	/**
	 * Creates how the simulation is to run and what things will be needed
	 * 
	 * @param shiftDuration
	 *            : how long the simulation is to run
	 * @param arrivalProbability
	 *            : probability that a customer will arrive within the length of
	 *            simulation
	 * @param processCart
	 *            : how long it takes to process (scan & bag) one item
	 * @param maxItems
	 *            : Randomly generated number that controls how many grocery items a
	 *            customer will have
	 */
	public void run(int shiftDuration, double arrivalProbability, int processCart, int maxItems) {

		this.shiftDuration = shiftDuration;
		this.maxItems = maxItems; 
		this.processCart = processCart; 
		this.arrivalProbability = arrivalProbability;
		Customer one;

		Queue shortestQueue;

		if (!line.isEmpty()) {

			for (int time = 0; time < shiftDuration; time++) {
				if (gen.nextDouble() <= arrivalProbability) {
					one = new Customer(gen.nextInt(maxItems) + 1, processCart);
					shortestQueue = getShortestQueue();
					shortestQueue.add(one);
					maxLength[line.indexOf(shortestQueue)]++;
				}

				for (int i = 0; i < line.size(); i++) {
					if (!line.get(i).isEmpty()) {

						Customer shopper = (Customer) line.get(i).element();
						shopper.decreaseTime();

						if (shopper.gettimeRemaining() == 0) {

							line.get(i).remove();

							customersServed++;

						}

					}

				}

			}
			printData();

			line.clear();

		}

	}

	/**
	 * Prints out the data to be shown on the console
	 */
	public void printData() {

		System.out.println("Duration of shift: " + shiftDuration);

		System.out.println("Checkout lines available: " + line.size());

		System.out.println("Probability of a customer arriving: " + arrivalProbability);

		System.out.println("Time it takes to scan and bag an item: " + processCart);

		System.out.println("Number of items in cart: " + maxItems);
		
		
		for( int i = 0; i < line.size(); i++) {
			System.out.println("Total customers line had: " + maxLength[i]);
		}

		for (int i = 0; i < line.size(); i++) {
			System.out.println("Number of customers left in line: " + line.get( i).size());
		}

		System.out.println("Total number of customers checked out: " + customersServed);

	}
}
