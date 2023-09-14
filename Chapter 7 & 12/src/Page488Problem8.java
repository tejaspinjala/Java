/*
 * Tejas Pinjala Chapter 7 & 12 Pg: 488 Problem # 8
 * 
 * Instruction Grade Book:
 * A teacher has five students who have taken four tests. Write a class that uses a String array or
 * an ArrayList object to hold the five students’ names, an array of five characters to hold the five
 * students’ letter grades, and five arrays of four doubles each to hold each student’s set of test scores.
 * The class should have methods that return a specific student’s name, the average test score, and a
 * letter grade based on the average.
 * 
 * Input Validation: Do not accept test scores less than zero or greater than 100.
 */


import java.util.Scanner;

public class Page488Problem8 {
	
	// initialized final int variables
	final static int STUDENTS = 5;
	final static int TESTS = 4;
	
	// declared string and double
	static String[] names = new String[STUDENTS];
	static double[][] scores = new double[STUDENTS][TESTS];
	
	// scanner class
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args) {
		// gets the students names
		for(int i = 0; i < STUDENTS; i++) {
			System.out.printf("Enter the name of student %d: ", i + 1);
	      	names[i] = keyboard.nextLine();
		}

		// gets the student's test scores
		for (int row = 0; row < STUDENTS; row++)
	     {
	         for (int col = 0; col < TESTS; col++)
	         {
	            System.out.printf("For students %d, enter Test score %d: ", row + 1, col + 1);
	            scores[row][col] = keyboard.nextInt();
	            while(scores [row][col] < 0 || scores[row][col] > 100) {
	            	System.out.printf("Incorrect Input: For students %d, enter Test score %d: ", row + 1, col + 1);
		            scores[row][col] = keyboard.nextInt();
	            }
	            
	          }
	      }
	      System.out.println();
	      
	      System.out.println("Student Name\t\tAverage\tGrade");
	    
	      // runs the for loop and displays the student's name, test scores, average and grade
	      double avg = 0;
	      for (int i = 0; i < STUDENTS; i++)
	      {
	        
	         double average = calTestAverage(scores[i]);
	         avg = avg + average;
	         String grade = letterGrade(average);
	         String studentName = names[i];
	         double [] stuScores = scores[i];
			System.out.println(studentName + "\t\t\t" + average + "\t" + grade);
		
	      }	 
	      
	}

	// calculates the students test score average
	public static double calTestAverage(double [] test) {
		// gets the average test score for each student
		double average = (test[0] + test[1] + test[2]) / 3;
		average = Math.round(average * 10.0) / 10.0;
		return average;
	}
	
	// assigns a letter grade depending on the test score average
	public static String letterGrade(double average) {
		String grade;
		
		if(average >= 90) {
			grade = "A";
		} else if (average >= 80 && average < 90) {
			grade = "B";
		} else if (average >= 70 && average < 80) {
			grade = "C";
		} else if (average >= 60 && average < 70) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
}