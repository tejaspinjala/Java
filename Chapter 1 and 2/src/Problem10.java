/*
 * Tejas Pinjala Chapter 1 & 2 Pg: 106; #10
 * Instruction: Test Average
 * Write a program that asks the user to enter three test scores. The program should
 * display each test score, as well as the average of the test scores.
 */

import java.util.Scanner;

public class Problem10 {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double testscore1, testscore2, testscore3;
		
		System.out.println("Please enter your test score 1: ");
		testscore1 = keyboard.nextDouble();
		System.out.println("Please enter your test score 2: ");
		testscore2 = keyboard.nextDouble();
		System.out.println("Please enter your test score 3: ");
		testscore3 = keyboard.nextDouble();
		
		double average = (testscore1 + testscore2 + testscore3) / 3;
		
		System.out.println("Your test score 1 is " + testscore1);
		System.out.println("Your test score 2 is " + testscore2);
		System.out.println("Your test score 3 is " + testscore3);
		System.out.println("Your average test score is " + average);
	}
}
