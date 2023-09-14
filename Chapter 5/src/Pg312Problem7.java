/*
 * Tejas Pinjala Chapter 5 Pg: 312 Problem # 7
 * 
 * Instruction Test Average and Grade:
 * Write a program that asks the user to enter five test scores. The program 
 * should display a letter grade for each score and the average test score.
 */

//Imports Scanner class
import java.util.Scanner;

public class Pg312Problem7 {
	public static void main(String [] args) {
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Declares doubles called test1, test2, test3, test4, test5
		double test1, test2, test3, test4, test5;
		
		//Asks the user input for the test score 1
		System.out.println("Please enter the test score 1: ");
		test1 = keyboard.nextDouble();
		//Checks and asks the user to enter a value between 0 to 100
		while(test1 <= 0 || test1 >= 100) {
			System.out.println("Incorrect input: Please enter the test score 1 (between 0 to 100): ");
			test1 = keyboard.nextDouble();
		}
		
		//Asks the user input for the test score 2
		System.out.println("Please enter the test score 2: ");
		test2 = keyboard.nextDouble();
		//Checks and asks the user to enter a value between 0 to 100
		while(test2 <= 0 || test2 >= 100) {
			System.out.println("Incorrect input: Please enter the test score 2 (between 0 to 100): ");
			test2 = keyboard.nextDouble();
		}
		
		//Asks the user input for the test score 3
		System.out.println("Please enter the test score 3: ");
		test3 = keyboard.nextDouble();
		//Checks and asks the user to enter a value between 0 to 100
		while(test3 <= 0 || test3 >= 100) {
			System.out.println("Incorrect input: Please enter the test score 3 (between 0 to 100): ");
			test3 = keyboard.nextDouble();
		}
		
		//Asks the user input for the test score 4
		System.out.println("Please enter the test score 4: ");
		test4 = keyboard.nextDouble();
		//Checks and asks the user to enter a value between 0 to 100
		while(test4 <= 0 || test4 >= 100) {
			System.out.println("Incorrect input: Please enter the test score 4 (between 0 to 100): ");
			test4 = keyboard.nextDouble();
		}
		
		//Asks the user input for the test score 5
		System.out.println("Please enter the test score 5: ");
		test5 = keyboard.nextDouble();
		//Checks and asks the user to enter a value between 0 to 100
		while(test5 <= 0 || test5 >= 100) {
			System.out.println("Incorrect input: Please enter the test score 5 (between 0 to 100): ");
			test5 = keyboard.nextDouble();
		}
		
		//Prints the letter grade for each test score
		System.out.println("\nThe grade for test score 1 is: " + determineGrade(test1));
		System.out.println("The grade for test score 2 is: " + determineGrade(test2));
		System.out.println("The grade for test score 3 is: " + determineGrade(test3));
		System.out.println("The grade for test score 4 is: " + determineGrade(test4));
		System.out.println("The grade for test score 5 is: " + determineGrade(test5));
		
		//Prints out the average test score and the average letter grade
		System.out.printf("\nThe average is : %.1f", calcAverage(test1, test2, test3, test4, test5));
		System.out.println("\nThe average letter grade is : " + determineGrade(calcAverage(test1, test2, test3, test4, test5)));
	}
	
	//Calculates the average
	public static double calcAverage(double a, double b, double c, double d, double f) {
		double average = (a + b + c + d + f) / 5;
		return average;
	}
	
	//Assigns a letter grade for each test score
	public static char determineGrade(double grade) {
		
		if(grade >= 90 && grade <= 100) {
			return 'A';
		} else if(grade >= 80 && grade <= 89) {
			return 'B';
		} else if(grade >= 70 && grade <= 79) {
			return 'C';
		} else if(grade >= 60 && grade <= 69) {
			return 'D';
		} else {
			return 'F';
		}
		
	}
}
