/*
 * Tejas Pinjala Chapter 4 Pg: 264 Problem # 11
 * 
 * Instruction Celsius to Fahrenheit Table:
 * Write a program that displays a table of the Celsius temperatures 0 through
 * 20 and their Fahrenheit equivalents. 
 * 
 *  F = (9/5)C +32
 */

public class Pg264Problem11 {
	public static void main(String [] args) {
		//Declares a double called fahrenheit
		double fahrenheit;
		
		System.out.println("Celsius\tFahrenheit");
		System.out.println("-------\t----------");
		
		//Calculates and displays the conversions from 0 through 20
		for(double celsius = 0; celsius <= 20; celsius++) {
			fahrenheit = (( (double) 9 / 5) * celsius) + 32;
			System.out.printf("%.1f\t%.1f\n", celsius, fahrenheit);
		}
	}
}
