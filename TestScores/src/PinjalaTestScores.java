/* Tejas Pinjala Chapter 6 Lab Assignment 2
 * 
 * Instruction:
 * Write a TestScores class that has fields to hold three test scores.
 * Demonstrate the class by writing a separate program that creates an instance of the class that
 * asks the user for the 3 test scores and displays the average.
 */
public class PinjalaTestScores {
	private double testScore1;
	private double testScore2;
	private double testScore3;
	
	// test score field vairables
	public PinjalaTestScores(double s1, double s2, double s3) {
		testScore1 = s1;
		testScore2 = s2;
		testScore3 = s3;
	}
	
	// returns testScore1
	public double getscore1() {
		return testScore1;
	}
	
	public void setscore1(double score1) {
		testScore1 = score1;
	}
	
	// returns testScore2
	public double getscore2() {
		return testScore2;
	}
	
	public void setscore2(double score2) {
		testScore2 = score2;
	}
	
	// returns testScore3
	public double getscore3() {
		return testScore3;
	}
	
	public void setscore3(double score3) {
		testScore3 = score3;
	}
	
	// returns the average out of the three test scores
	public double average() {
		return ((testScore1 + testScore2 + testScore3) / 3);
	}
}
