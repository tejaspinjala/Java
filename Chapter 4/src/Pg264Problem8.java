/*
 * Tejas Pinjala Chapter 4 Pg: 264 Problem # 8
 * 
 * Instruction Average Rainfall:
 * Write a program that uses nested loops to collect data and calculate the average
 * rainfall over a period of years
 * 
 */

//Imports Scanner class
import java.util.Scanner;

public class Pg264Problem8 {
	public static void main(String [] args) {
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Declares an int called years and months
		int years, totalMonths = 0, months = 12;
		//Declares a double called rainfall and average
		double rainfall, totalRainfall = 0, average;
		
		
		//Asks the user input for the number of years
		System.out.println("Please enter the number of years: ");
		years = keyboard.nextInt();
		//Checks if the input is at least 1
		while(years < 1){
			System.out.println("Incorrect input: Please enter the number of years: ");
			years = keyboard.nextInt();
		}
		
		//Outer loop iterates once for each year
		for(int y = 1; y <= years; y++) {
			//Inner loop iterates 12 times, once for each year
			for(int m = 1; m <= months; m++) {
				//Asks the user input for the inches of rainfall for each month of the year
				System.out.println("Please enter the inches of rainfall for year " + y + ", month " + m + " :");
				rainfall = keyboard.nextDouble();
				//Checks if the value entered is negative or not
				while(rainfall <= -1) {
					System.out.println("Incorrect input: Please enter the inches of rainfall for year " + y + ", month " + m + " :");
					rainfall = keyboard.nextDouble();
				}
				
				//Calculates and adds the total number of months
				totalMonths = totalMonths + 1;
				//Calculates and adds the total inches of rainfall
				totalRainfall = totalRainfall + rainfall;
				
			}
		}
		//Calculates the average rainfall per month
		average = totalRainfall / totalMonths;
		
		//Displays the results
		System.out.println("Total number of Months: " + totalMonths);
		System.out.printf("Toatl number of rainfall (inches): %.2f", totalRainfall);
		System.out.printf("\nAverage rainfall per month: %.2f", average);
	}
}
