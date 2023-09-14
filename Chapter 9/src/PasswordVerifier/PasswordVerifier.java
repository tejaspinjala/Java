/*
 * Tejas Pinjala Chapter 9 Pg: 605 Problem # 5
 * COSC - 1437
 * Professor Woods
 * 11/04/2020
 * 
 * Password Verifier
 */

package PasswordVerifier;

//Imports the Scanner class
import java.util.Scanner;

public class PasswordVerifier {

	public static void main(String[] args) {
		//Scanner class
		Scanner keyboard = new Scanner(System.in);
	        
		//Stores the user password input
		String userinput;

		//Asks for the user to enter the password
		System.out.print("Please Enter a Password that is 6 letters long, "
				+ "\ncontains atleast one uppercase and one lowercase letter, "
				+ "\nand should contain atleast one digit: ");
		userinput = keyboard.nextLine();

		//Prints if the password is valid or not
		if (checkPassword(userinput)) {
			System.out.println("Password is valid!");
		} else {
			System.out.println("Not a valid password: Please enter again!");
		}

	}

	public static boolean checkPassword(String password) {
		//Checks if the password length is at least 6
		if (password.length() < 6) {
			return false;
		}
		
		//Initializes boolean variables for the conditions
		boolean lowercase = false, uppercase = false, digit = false;
		
		//Checks if there is at least an upper case, lower case and a digit
		for (int i = 0; i < password.length(); i++) {
			
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				lowercase = true;
			} else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				uppercase = true;
			} else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				digit = true;
			} else {
				return false;
			}
		}
		
		//Returns if the conditions are true or false
		return (lowercase && uppercase && digit);
		
	}

}
