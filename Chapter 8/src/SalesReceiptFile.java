/*
 * Tejas Pinjala Chapter 8 Pg: 554 Problem # 7 
 * 
 * Instruction Sales Receipt File:
 * Modify the program you wrote in Programming Challenge 6 to create a file containing a
 * sales receipt.
 */


//imports the necessary classes
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class SalesReceiptFile {
	public static void main(String [] args) throws IOException{
		//Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//FileWriter object
		FileWriter fw = new FileWriter("FileName.txt", true);
		
		//asks the user input for the quantity
		System.out.println("Enter the number of items you'd like to purchase: ");
		int num = keyboard.nextInt();
		
		//variables
		double price = 10;
		double getSubTotal = num * price;
		double getTax = 3;
		double getTotal = getSubTotal + getTax;
		
		fw.close();
		
		//output
		System.out.println("----------SALES RECEIPT----------");
		System.out.println("Unit Price: $" + price);
		System.out.println("Quantity: " + num);
		System.out.println("Subtotal: $" + getSubTotal);
		System.out.println("Sales Tax: $" + getTax);
		System.out.println("Total: $" + getTotal);
		
	}
}
