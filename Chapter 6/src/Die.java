/*
 * Tejas Pinjala Chapter 6 Pg: 400 Problem # 15
 * 
 * Instruction Dice Game:
 * Write a program that uses the Die class that was presented in this chapter to 
 * play a simple dice game between the computer and the user. The program 
 * should create two instances of the Die class (each a 6-sided die). One Die 
 * object is the computer’s die, and the other Die object is the user’s die.
 */

//Imports Scanner class
import java.util.Scanner;
//Imports Random class
import java.util.Random;

public class Die {
	public static void main(String [] args) {
		int turns = 10;		//Total number of rolls
		int compScore = 0; 	//Keeps track of the computer score
		int userScore = 0;	//Keeps track of the user score
		
		//Random class object
		Random randomNum = new Random();
		
		//Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//Runs the loop 10 times
		for(int i = 1; i <= turns; i++) {
			int compRoll = randomNum.nextInt(6) + 1; //Assigns a random number to the computer from 1 to 6
			int userRoll = randomNum.nextInt(6) + 1; //Assigns a random number to the user from 1 to 6
			
			//Adds a score depending on who won each round, in case of a tie no one gets a score
			if(compRoll > userRoll) {
				compScore = compScore + 1;
				System.out.println("Computer won the round " + i);
			} else if (userRoll > compRoll) {
				userScore = userScore + 1;
				System.out.println("User won the round " + i);
			} else {
				System.out.println("Round " + i + " was a tie");
			}
		}
		
		//Prints out whoever won the overall dice game
		if(compScore > userScore) {
			System.out.println("Computer won majority of the round with a score of " + compScore + " out of " + turns + " turns.");
		} else if(userScore > compScore) {
			System.out.println("User won majority of the round with a score of " + userScore + " out of " + turns + " turns.");
		} else {
			System.out.println("It was a tie between the user and the computer with a user score of " + userScore + " and a computer score of " + compScore);
		}
	}
}
