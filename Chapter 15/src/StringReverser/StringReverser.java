/*
 * Tejas Pinjala Chapter 15
 * COSC - 2436
 * Professor Woods
 * 03/02/2021
 * 
 * String Reverser:
 * Write a recursive method that accepts a string as its argument and prints the string in 
 * reverse order. Demonstrate the method in a program.
 */

package StringReverser;

//imports scanner class
import java.util.Scanner;

public class StringReverser {
	//main method
	public static void main(String [] args) {
		//declares a string variable
		String userInput;
		//declares the scanner
		Scanner keyboard = new Scanner(System.in);
		
		//asks the user to enter a string
		System.out.println("Please enter the string you want to be reversed.");
		userInput = keyboard.nextLine();
		
		//reverses the string and prints it out
		for(int i = 0; i < userInput.length(); i++) {
			System.out.print(userInput.charAt(userInput.length() - 1 - i));
		}

	}		
}
