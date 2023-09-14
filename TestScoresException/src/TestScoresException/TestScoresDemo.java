/* 
 * Tejas Pinjala Chapter 11 Pg: 749  Problem # 2
 * COSC - 1437
 * Professor Woods
 * 12/04/2020
 * 
 * TestScores
 */

package TestScoresException;

//scanner class
import java.util.Scanner;

public class TestScoresDemo {
	//main method
	public static void main(String [] args) {
		int [] testScore = array(readInput("Enter the number of test scores: "));
		//try-catch 
		try {
			//declares the object
			TestScores testScore1 = new TestScores(testScore);
			System.out.println("\nAverage Test Scores: " + testScore1.getAverage());
			
		} catch(IllegalArgumentException e) {
			System.out.println("You have entered an invalid test score.\n" + e.getMessage());
		}
		
	}
	
	//declares array method
	public static int [] array(int a) {
		int grade [] = new int[a];
		for(int i = 0; i < grade.length; i++) {
			grade[i] = readInput("Enter the test score " + (i + 1) + ": ");
		}
		return grade;
	}
	
	//declares readInput method
	public static int readInput(String str) {
		//declares a scanner object
		Scanner keyboard = new Scanner(System.in);
		System.out.println(str);
		return keyboard.nextInt();
	}
}
