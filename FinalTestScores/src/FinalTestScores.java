/*
 * Tejas Pinjala Project II 
 * 
 * Instruction:
 * Write a program that has ten students who have taken three tests. Use an array to store the test 
 * scores and it should ask  the user to enter each student’s first name, last name, and his or 
 * her three test scores.
 * 
 */

import java.util.Scanner;

public class FinalTestScores {
	
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
	      
	      System.out.println("Student Name\t\tTest1\tTest2\tTest3\tAverage\tGrade");
	    
	      // runs the for loop and displays the student's name, test scores, average and grade
	      double avg = 0;
	      for (int i = 0; i < STUDENTS; i++)
	      {
	        
	         double average = calTestAverage(scores[i]);
	         avg = avg + average;
	         String grade = letterGrade(average);
	         String studentName = names[i];
	         double [] stuScores = scores[i];
			System.out.println(studentName + "\t\t\t" + stuScores[0] + "\t" + stuScores[1] +"\t" + stuScores[2] + "\t" + average + "\t" + grade);
		
	      }	 
	      
	      // displays the class average
	      double classavg = avg / STUDENTS;
	      System.out.println("\nThe class average is " + classavg);
	      
	}
/*	
	// returns an empty string index
	public static String getNames(String[] names, int index)
	{
	      return names[index];
	   
	   }
*/	
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


			
	
