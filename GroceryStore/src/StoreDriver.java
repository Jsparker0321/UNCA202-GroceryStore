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

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class StoreDriver {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		System.out.println();
		System.out.println("Ingles: ");
		System.out.println();
		GroceryStore test1 = new GroceryStore(2);
		test1.run(200, 0.5, 3, 10);

		System.out.println("-------------------------------------------");

		System.out.println("Target: ");
		System.out.println();
		GroceryStore test2 = new GroceryStore(4);
		test2.run(800, 0.64, 4, 19);

		System.out.println("-------------------------------------------");

		System.out.println("Harris Teeter: ");
		System.out.println();
		GroceryStore test3 = new GroceryStore(6);
		test3.run(600, 0.93, 2, 32);

		System.out.println("Walmart: ");
		System.out.println();
		GroceryStore test4 = new GroceryStore(8);
		test4.run(527, 0.74, 1, 20);
	}

}
