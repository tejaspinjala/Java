/*
 * Instruction:
	The program will ask the user to enter the
	width and length of a rectangle, and then display the rectangle’s area. The program calls the following
	methods, which have not been written:
 		getLength – This method should ask the user to enter the rectangle’s length, and then return
		that value as a double.
 		getWidth – This method should ask the user to enter the rectangle’s width, and then return that
		value as a double.
 		getArea – This method should accept the rectangle’s length and width as arguments, and return
		the rectangle’s area. The area is calculated by multiplying the length by the width.
 		displayData – This method accept the rectangle’s length, width, and area as arguments, and
		display them in appropriate message on the screen. 
 */

// You must complete this program so it calculates and displays the area of a rectangle.
// Insert any necessary import statements here.

import java.util.Scanner; // Imports Scanner

public class AreaRectangle {
	
	public static void main(String[]args) {
		double length, // The rectangle's length
		width, // The rectangle's width
		area; // The rectangle's area
		
		// Get the rectangle's length from the user.
		length = getLength();
		
		// Get the rectangle's width from the user.
		width = getWidth();
		
		// Get the rectangle's area.
		area = getArea(length, width);
		 
		// Display the rectangle data.
		displayData(length, width, area);
    }

	
    public static double getLength() {
    	Scanner keyboard = new Scanner(System.in); // Scanner
    	System.out.print("Please enter length: ");
    	double length = keyboard.nextDouble();		// Takes in the user input
    	return length;
    }
    
    
    public static double getWidth() {
    	Scanner keyboard = new Scanner(System.in); // Scanner
    	double width;
    	System.out.print("Please enter width: ");
    	width = keyboard.nextDouble();
    	return width;
    }

    
    public static double getArea(double length, double width) {
    	double area = length * width;
    	System.out.println("The area is: " + area);
    	return area;
    }

    public static void displayData(double length, double width, double area) {
    	System.out.println("\nThe length is:\t" + length);
    	System.out.println("The width is: \t" + width);
    	System.out.println("The area is: \t" + area);
    }
    
}



