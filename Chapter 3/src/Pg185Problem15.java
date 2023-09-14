/*
 * Tejas Pinjala Chapter 3 Pg: 185 Problem # 15
 * 
 * Instruction:
 * Write a program that ask for the number of checks written for the month.
 * The program should then calculate and display the bank's fees for the month.
 * 
 */

//Imports Scanner class
import java.util.Scanner;

public class Pg185Problem15 {
	public static void main(String [] args) {
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Declares an int called checks and basefee
		int checks, basefee = 10;
		//Declares a double called total
		double total;
		
		//Asks the user input for the amount of checks written in the month
		System.out.println("Please enter the number of checks written for the month: ");
		checks = keyboard.nextInt();
		//Checks if the input is valid or not
		while(checks < 0){
			System.out.println("Incorrect input: Please enter the number of checks written for the month: ");
			checks = keyboard.nextInt();
		}
		
		//If statement that calculates and displays the bank fees for the month
		if(checks < 20) {
			total = basefee + .10;
			System.out.println("The bank service fees for the month is $" + total);
		} else if(checks >= 20 && checks <= 39) {
			total = basefee + .08;
			System.out.println("The bank service fees for the month is $" + total);
		} else if(checks >= 40 && checks <= 59) {
			total = basefee + .06;
			System.out.println("The bank service fees for the month is $" + total);
		} else if(checks >= 60){
			total = basefee + .05;
			System.out.println("The bank service fees for the month is $" + total);
		} else {
			System.out.println("The bank service fees for the month is $" + basefee);
		}
	}
}
