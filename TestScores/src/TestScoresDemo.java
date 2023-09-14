import java.util.Scanner;

public class TestScoresDemo {
	public static void main(String [] args) {
		// Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		double score1, score2, score3;
		
		// Asks the user and takes in the test scores 
		System.out.println("Please enter the first test score: ");
		score1 = keyboard.nextDouble();
		System.out.println("Please enter the second test score: ");
		score2 = keyboard.nextDouble();
		System.out.println("Please enter the third test score: ");
		score3 = keyboard.nextDouble();
		PinjalaTestScores score = new PinjalaTestScores(score1, score2, score3);
		
		// Prints the average
		System.out.println("Average of the test scores: " + score.average());
		
	}
}
