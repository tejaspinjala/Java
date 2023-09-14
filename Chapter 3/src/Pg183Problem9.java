/*
 * Tejas Pinjala Chapter 3 Pg: 183 Problem # 9
 * 
 * Instruction:
 * Write a program that asks the user to enter the weight of a package
 * and then display the shipping charges
 */

//imports Scanner class
import java.util.Scanner;

public class Pg183Problem9 {
	public static void main(String [] args) {
		//Scanner 
		Scanner keyboard = new Scanner(System.in);
		
		//Declares a double called pounds
		double pounds;
		
		//Asks the user's input for the package
		System.out.println("Please enter the weight of the package you want to ship (in pounds): ");
		pounds = keyboard.nextDouble();
		//Checks if the entered value is over 0
		while(pounds <= 0){
			System.out.println("Incorrect input: Please enter the weight of the package you want to ship (in pounds): ");
			pounds = keyboard.nextDouble();
		}
		
		//If statement that displays the shipping charge based on the weight of the package
		if(pounds <= 2) {
			System.out.println("The shipping charge for " + pounds + " pounds is $1.10");
		} else if(pounds > 2 && pounds <= 6) {
			System.out.println("The shipping charge for " + pounds + " pounds is $2.20");
		} else if(pounds > 6 && pounds <= 10) {
			System.out.println("The shipping charge for " + pounds + " pounds is $3.70");
		} else {
			System.out.println("The shipping charge for " + pounds + " pounds is $3.80");
		}
	}
}
