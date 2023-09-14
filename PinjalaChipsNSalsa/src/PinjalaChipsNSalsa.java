/* Tejas Pinjala Chapter 7 Lab Assignment 1 - Two Parallel Array
 * 
 * Instruction:
 * Write a program that lets a maker of chips and salsa keep track of sales for three 
 * different types of salsa and should use two parallel 3 element arrays.
 * 
 */

import java.util.Scanner;

public class PinjalaChipsNSalsa {
	public static void main(String [] args) {
		
		// Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		// Initializes the int array
		final int ARRAY_SIZE = 3;
		int[] jars = new int[ARRAY_SIZE];
		
		// String array that holds the salsa types
		String[] salsa = new String[] {"California Mild", "Hawaii Medium", "Texas Hot"};
		
		System.out.println("\tRICH CHIPS & SALSA SALES REPORT\n");
		
		// Checks to see for valid input and stores the mild salsa's value entered
		System.out.println("How many jars of California Mild were sold this month? ");
		jars[0] = keyboard.nextInt();
		while(jars[0] < 1) {
			System.out.println("Incorrect input: How many jars of California Mild were sold this month? ");
			jars[0] = keyboard.nextInt();
		}
		
		// Checks to see for valid input and stores the medium salsa's value entered
		System.out.println("How many jars of Hawaii Medium were sold this month? ");
		jars[1] = keyboard.nextInt();
		while(jars[1] < 1) {
			System.out.println("Incorrect input: How many jars of Hawaii Medium were sold this month? ");
			jars[1] = keyboard.nextInt();
		}
		
		// Checks to see for valid input and stores the hot salsa's value entered
		System.out.println("How many jars of Texas Hot were sold this month? ");
		jars[2] = keyboard.nextInt();
		while(jars[2] < 1) {
			System.out.println("Incorrect input: How many jars of Texas Hot were sold this month? ");
			jars[2] = keyboard.nextInt();
		}
		
		// Initialized variables
		int min = jars[0];
		int max = jars[0];
		int min_index = 0;
		int max_index = 0;
		int total = 0;
		
		// Runs through the whole array
		for(int i = 0; i < jars.length; i++) {
			// Gets the total value of the array
			total = total + jars[i];
			
			// Gets the min value and gets which salsa has the least
			if(jars[i] < min) {
				min = jars[i];
				min_index = i;
			}
			
			// Gets the max value and gets which salsa has the most
			if(jars[i] > max) {
				max = jars[i];
				max_index = i;
			}
			
		}
		
		// Prints the report
		System.out.println("\n\tRICH CHIPS & SALSA SALES SUMMARY\n");
		
		System.out.println("Product Name\t\tUnits Sold");
		
		System.out.println("---------------\t\t----------");
		
		System.out.println("California Mild\t\t" + jars[0]);
		System.out.println("Hawaii Medium\t\t" + jars[1]);
		System.out.println("Texas Hot\t\t" + jars[2]);
		
		System.out.println("---------------\t\t----------");
		
		System.out.println("Total Number Sold\t" + total);
		
		System.out.println("\nThis month the most sold was:\t" + salsa[max_index]);
		System.out.println("This month the least sold was:\t" + salsa[min_index]);
		
	}
}
