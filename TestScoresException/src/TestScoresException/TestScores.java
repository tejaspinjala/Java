/* 
 * Tejas Pinjala Chapter 11 Pg: 749  Problem # 2
 * COSC - 1437
 * Professor Woods
 * 12/04/2020
 * 
 * TestScores
 */

package TestScoresException;

public class TestScores {
	//declares variables
	protected int [] grades;
	protected int avg;
	
	//declares the constructor
	public TestScores (int [] score) throws IllegalArgumentException {
		avg = validScore(score);
		grades = score;
	}
	
	//method throws if the conditions are not met
	public int validScore(int [] score) {
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] < 0 || score[i] > 100) {
				throw new IllegalArgumentException("Test Score " + (i + 1) + " is not in the range");
			}
		}
		
		return (avg / score.length);
	}
	
	//returns the average
	public int getAverage() {
		return avg;
	}
}
