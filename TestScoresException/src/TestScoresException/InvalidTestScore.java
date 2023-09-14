/* 
 * Tejas Pinjala Chapter 11 Pg: 749  Problem # 2
 * COSC - 1437
 * Professor Woods
 * 12/04/2020
 * 
 * InvalidTestScore
 */

package TestScoresException;

public class InvalidTestScore extends Exception{
	//declares a string
	private String message;

	//refers to the variable
	public InvalidTestScore(String message) {
		this.message = message;
	}
	
	//returns the variable
	public String getMessage() {
		return message;
	}
}
