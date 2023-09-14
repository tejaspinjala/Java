/*
 * Tejas Pinjala Chapter 5 Pg: 314 Problem # 12
 * 
 * Instruction Kinetic Energy:
 * Write a method named kineticEnergy that accepts an object’s mass (in kilograms) and 
 * velocity (in meters per second) as arguments. The method should return the amount of 
 * kinetic energy that the object has. Demonstrate the method by calling it in a program that 
 * asks the user to enter values for mass and velocity.
 * 
 * KE = 1/2 mv^2
 */

//Imports Scanner class
import java.util.Scanner;

public class Pg314Problem12 {
	public static void main(String [] args) {
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		double mass, velocity, kineticEnergy;
		
		//Asks the user input for the mass
		System.out.println("Please enter the mass (in kilograms): ");
		mass = keyboard.nextDouble();
		
		//Asks the user input for the velocity
		System.out.println("Please enter the velocity (in meters per second): ");
		velocity = keyboard.nextDouble();
		
		kineticEnergy = kineticEnergy(mass, velocity);
		System.out.println("The mass is " + mass + " kgs.");
		System.out.println("The velocity is " + velocity + " m/s.");
		System.out.printf("The kinetic energy is %.2f J.", kineticEnergy);
	}
	
	public static double kineticEnergy(double m, double v) {
		double kn = ((double) 1 / 2) * m * (Math.pow(v, 2));
		return kn;
	}
}
