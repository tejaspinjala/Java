/* 
 * Tejas Pinjala
 * COSC - 1437
 * Professor Woods
 * 12/07/2020
 * 
 * Palindrome Detector
 * 
 * The Problem:
 * A palindrome is a phrase that reads the same forwards as it does backwards. For
 * example, “a man, a plan, a canal, Panama,” is a palindrome. Write a program
 * that uses a stack data structure to check for palindromes in each line of a text file
 */

package PalindromeDetector;

//Imports all the necessary files
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Declares Palindrome class
public class Palindrome {
	
	//Boolean method determines if it a palindrome or not
	private static boolean ifPalindromeExists(String text) {
		//Changes the text to lower case characters and takes out the special characters that are not needed
		text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		//Gets the length
		int len = text.length() - 1;
		//Checks the beginning and end and increments towards the middle
		for (int i = 0; i <= len;  i++, len--) {
			//Checks if the letters match
			if (text.charAt(i) != text.charAt(len)) {
				return false;
			}
		}
	
		return true;
	}
	
	//Declares fileReader method
	public static String[] fileReader(String file) {
		//Creates a new File object
		File files = new File(file);
		//Sets the scanner object to null
		Scanner sc = null;
		//Initializes a variable that holds the lines
		int lines = 0;
		
		//Checks to see for an invalid file
		try {
			sc = new Scanner(files);
		} catch (FileNotFoundException ex) {
			System.out.println(file + " can't be found.");
			System.exit(1);
		}
		
		//Runs through every line of the code
		for (int i = 0; sc.hasNextLine(); lines++) { 
			sc.nextLine();
		}
		//Closes the scanner object
		sc.close();
		
		//Checks the text again
		try {
			sc = new Scanner(files);
		} catch (FileNotFoundException ex) {
			System.out.println(file + " can't be found");
			System.exit(1);
		}
		
		//String array to find the palindromes
		String[] findPalindrome = new String[lines];
		
		//Assigns an index to to the lines
		for(int i = 0; i < lines; i++) {
			findPalindrome[i] = sc.nextLine();
		}
		sc.close();
		
		//Returns the palindromes that are found
		return findPalindrome;
	}
	
	//Main method
	public static void main(String[] args) throws IOException {
		//Imports the file	
		String textFile = "palindromes.txt";	
		//Reads the file
		String [] palindromes = fileReader(textFile);
		
		//Goes through the text
		for (int index = 0; index < palindromes.length; index++) {	
			//Shows which statement is a palindrome and prints it out	
			if (ifPalindromeExists(palindromes[index])) {
				System.out.println("\"" + palindromes[index] + "\" is a palindrome.");
			} 		
		}
	}
}

/*
Project Write up:

In my code, I first imported all the necessary classes that are required for the program. Then I
declared a boolean method called ifPalindromeExists which determines if the line is a palindrome or not. I
passed a string called text through which converts the sting to all lower case since java is case 
sensitive. I also took out the unnecessary characters that might lead to an unintended output. After
that, I wrote a for-loop that checks the first letter of the string and the last letter and gradually
increments towards the middle to see if they match together and returns true or false.

The second method that I declared is a String array called fileReader. It first uses the file class and
creates a new File. I also used the scanner class and set it to a null value to change it later. The
try/catch exception is used to handle the exception that is thrown out if the file is invalid. Then I
made a for-loop to run through each line and store the value so that line can be used to check whether it
is a palindrome or not. I also declared a String array to find if the potential line is a palindrome.

Finally, in the main method I called on the "palindromes.txt" which contains the data to check and read for
the palindromes. It runs throught the whole length of the text and calls on the ifPalindromeExists method
and prints out the ones which are a palindrome.
*/