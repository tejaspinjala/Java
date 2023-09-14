/*
 * Tejas Pinjala Chapter 8 Pg: 555 Problem # 9
 * 
 * Geometry Calculator
 */

import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {

	    int pick; // The user's menu choice

	    // Get the user's menu choice.
	    pick = getMenu();

	    // Calls on the method according to the user input
	    if (pick == 1) {
	    	circleArea();
	    } else if (pick == 2) {
	    	rectangleArea();
	    } else if (pick == 3) {
	    	triangleArea();
	    } else if (pick == 4) {
	    	System.out.println("Exit the program");
	    }

	}

	public static int getMenu() {

	    int userInput;

	    // keyboard input
	    Scanner keyboard = new Scanner(System.in);

	    // Display the menu.
	    System.out.println("Geometry Calculator");
	    System.out.println("1. Calculate the Area of a Circle");
	    System.out.println("2. Calculate the Area of a Rectangle");
	    System.out.println("3. Calculate the Area of a Triangle");
	    System.out.println("4. Quit\n");
	    
	    System.out.print("Enter your choice (1-4) : ");
	    // Gets the user input of what they want
	    userInput = keyboard.nextInt();

	    // Makes sure the input is within the range
	    while (userInput < 1 || userInput > 4) {
	        System.out.print("Incorrect input: Please enter a valid range: 1, 2, 3, or 4: ");
	        userInput = keyboard.nextInt();
	    }

	    return userInput;
	}
	
	public static void circleArea() {

	    double radius;

	    // Scanner input
	    Scanner keyboard = new Scanner(System.in);
	    
	    // Gets the circle radius
	    System.out.println("Enter the circle's radius? ");
	    radius = keyboard.nextDouble();

	    // Display the circle's area
	    System.out.println("The circle's area is " + Geometry.areaOfCircle(radius));
	}
	
	public static void rectangleArea() {
	    
		double length, width;
		
	    // Scanner input
	    Scanner keyboard = new Scanner(System.in);

	    // Gets the length
	    System.out.print("Enter the length: ");
	    length = keyboard.nextDouble();

	    // Gets the width input
	    System.out.print("Enter the width: ");
	    width = keyboard.nextDouble();

	    // Display the rectangle's area
	    System.out.println("The rectangle's area is " + Geometry.areaOfRectangle(length, width));
	}
	
	public static void triangleArea() {

	    double base, height;

	    // Scanner input
	    Scanner keyboard = new Scanner(System.in);

	    // Gets the base input
	    System.out.print("Enter length of the triangle's base: ");
	    base = keyboard.nextDouble();

	    // Gets the height input
	    System.out.print("Enter triangle's height: ");
	    height = keyboard.nextDouble();

	    // Display the triangle's area
	    System.out.println("The triangle's area is " + Geometry.areaOfTriangle(base, height));
	}


public static class Geometry {
		
	public static double areaOfCircle(double radius) {
		double areaCircle = Math.PI * radius * radius;
		return areaCircle;
	}

	public static double areaOfRectangle(double length, double width) {
		double areaRectangle = length * width;
		return areaRectangle;
	}

	public static double areaOfTriangle(double base, double h) {
		double areaTriangle = base * h * 0.5;
		return areaTriangle;
	}
	    
	}
}

