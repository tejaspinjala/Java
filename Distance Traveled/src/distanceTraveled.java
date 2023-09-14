/* Instruction:
Write a program that asks the user to input the speed of a car (in miles-per-hour) and the
number of hours it has traveled. It should use a loop to display the distance a car has traveled
for each hour of a time period specified by the user.
The distance a vehicle travels can be calculated as follows”
Distance = Speed * Time
For example, if a car travels 60 miles-per-hour for three hours, the distance traveled is 180
miles.
Output:
It should display a report similar to the one that follows:
Hours Distance Traveled
--------------------------------------------
1 	60
2 	120
3 	180
Input Validation:
Do not accept a negative number for speed and do not accept any value less than 1 for time
traveled. 
 */

//Imports Scanner Class
import java.util.Scanner;

public class distanceTraveled {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in); //Scanner object and takes input from the keyboard
		
		double carSpeed;						  //Gets the double for the car speed
		int timeTraveled;						//Gets the time traveled
		double distance;						  //Gets the distance
		
//This while loop checks if the speed is a negative value or not and repeats till it is positive.
		System.out.print("Enter the speed of the car in miles per hour: "); //Asks the user input for the car speed
		carSpeed = scanner.nextDouble();
		while(carSpeed < 0) {
			System.out.print("Enter the speed of the car in miles per hour: "); //Asks the user input for the car speed
			carSpeed = scanner.nextDouble();
		}
		
//This while loop checks if the time is atleast 1 and repeats till it is meets the condition.
		System.out.print("Enter the number of hours the car traveled: ");   //Asks the user input for the hours the car traveled
		timeTraveled = scanner.nextInt();
		while(timeTraveled < 1) {
			System.out.print("Enter the number of hours the car traveled: ");   //Asks the user input for the hours the car traveled
			timeTraveled = scanner.nextInt();
		}
		
		
		System.out.println("\nHours\tDistance Traveled");
		System.out.println("-------------------------");
		
		
// This loop multiplies the values and returns them, it adds an increment every time it runs and the conditions are met.
		for(int hours = 1; hours <= timeTraveled; hours++) { 
			
			distance = (carSpeed * hours);			//multiplies speed and time to get distance
			System.out.println(hours + "\t" + distance);	//Prints the result in hours and the distance traveled.
			
		}		
		
	}
}
