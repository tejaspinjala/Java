/*Instruction:
 * 
 * Chapter 4 Lab Assignment 2
Distance File
Modify the program you wrote for Chapter 4 Lab Assignment 1 (Distance Traveled) so it writes
the report to a file instead of the screen. Open the file in Notepad or another text editor to
confirm the output.
*** The following program that you wrote for Chapter 4 Lab Assignment 1
Distance Traveled
The distance a vehicle travels can be calculated as follows”
Distance = Speed * Time
Write a program that asks the user to input the speed of a car (in miles-per-hour) and the
number of hours it has traveled. It should use a loop to display the distance a car has traveled
for each hour of a time period specified by the user.
For example, if a car travels 60 miles-per-hour for three hours, the distance traveled is 180
miles. It should display a report similar to the one that follows:
Hours Distance Traveled
--------------------------------------------
1 60
2 120
3 180
Input Validation
Do not accept a negative number for speed and do not accept any value less than 1 for time
traveled.
Submit the java source code only.
 * 
 */

import java.util.Scanner;   // Scanner class
import java.io.*;           // File I/O classes

public class Distance {
	public static void main(String [] args) throws IOException{
			
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in); 
	    
		
		String filename;						// Gets the file name
		double carSpeed;						  //Gets the double for the car speed
		int timeTraveled;						//Gets the time traveled
		double distance;						  //Gets the distance
		
		//This while loop checks if the speed is a negative value or not and repeats till it is positive.
		System.out.print("Enter the speed of the car in miles per hour: "); //Asks the user input for the car speed
		carSpeed = keyboard.nextDouble();
		while(carSpeed < 0) {
			
			System.out.print("Enter the speed of the car in miles per hour: "); //Asks the user input for the car speed
			carSpeed = keyboard.nextDouble();
			
		}
		
		
		//This while loop checks if the time is at least 1 and repeats till it is meets the condition.
		System.out.print("Enter the number of hours the car traveled: ");   //Asks the user input for the hours the car traveled
		timeTraveled = keyboard.nextInt();
		while(timeTraveled < 1) {
			
			System.out.print("Enter the number of hours the car traveled: ");   //Asks the user input for the hours the car traveled
			timeTraveled = keyboard.nextInt();
			
		}
		
		// Consume the remaining newline character.
	    keyboard.nextLine();
	      
		// Get the filename.
	    System.out.print("Enter the filename: ");
	    filename = keyboard.nextLine();
		
	   // Open the file.
	    PrintWriter outputFile = new PrintWriter(filename);
	    outputFile.

		    
		outputFile.println("\nHours\tDistance Traveled");
		outputFile.println("-------------------------");
		
		
		// This loop multiplies the values and returns them, it adds an increment every time it runs and the conditions are met.
		for(int count = 1; count <= timeTraveled; count++) { 
			
			distance = (carSpeed * count);			//multiplies speed and time to get distance
			outputFile.println(count + "\t\t" + distance);	//Prints the result in hours and the distance traveled.
			
		}		
		
		// Close the file.
	    outputFile.close();
	    System.out.println("Data written to the file.");
	}
}
