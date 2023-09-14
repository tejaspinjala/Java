/*
 * Tejas Pinjala Chapter 7 & 12 Pg: 490 Problem # 14
 * 
 * Instruction Name Search:
 * Write a program that reads the contents of the two files into two separate arrays, or
 * ArrayLists. The user should be able to enter a boy’s name, a girl’s name, or both, and
 * the application will display messages indicating whether the names were among the
 * most popular.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Page490Problem14 {
	//main method
	public static void main(String []args) throws IOException{
		//ArrayList class that stores the name of boys and girls
		ArrayList <String> boy = new ArrayList <String> ();
		ArrayList <String> girl = new ArrayList <String> ();
		
		//Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//declares variables
		String boys = "";
		String girls = "";
		boolean popularBoy = false;
		boolean popularGirl = false;
		int pick;
		
		//calls the readName method
		boy = readName("BoyNames.txt");
		girl = readName("GirlNames.txt");
		
		System.out.println("Enter your choice: ");
		System.out.println("1. Search for boy ");
		System.out.println("2. Search for girl ");
		System.out.println("3. Search for both ");
		pick = keyboard.nextInt();
		
		//asks the user to enter a boy's name
		if(pick == 1 || pick == 3) {
			System.out.println("Enter the name of a boy: ");
			boys = keyboard.next();
			popularBoy = boy.contains(boys);
		}
		//asks the user to enter a girl's name
		if(pick == 1 || pick == 3) {
			System.out.println("Enter the name of a girl: ");
			girls = keyboard.next();
			popularGirl = boy.contains(girls);
			System.out.println();
		}
		
		//checks if the boy's name is popular or not
		if(popularBoy) {
			System.out.println("\"" + boys + "\" is the most popular name in boys");
		}
		if((pick == 1 || pick == 3) && !popularBoy) {
			System.out.println("\"" + boys + "\" is not the most popular name in boys");
		}
		
		//checks if the girls's name is popular or not
		if(popularGirl) {
			System.out.println("\"" + girls + "\" is the most popular name in boys");
		}
		if((pick == 1 || pick == 3) && !popularGirl) {
			System.out.println("\"" + girls + "\" is not the most popular name in boys");
		}
	}
	
	public static ArrayList <String> readName(String fileName) throws IOException{
		//ArrayList class that stores names
		ArrayList <String> names = new ArrayList <String> ();
		
		//Scanner class
		Scanner inFile = new Scanner(System.in);
		String name;
		
		
		while(inFile.hasNextLine()) {
			name = inFile.nextLine();
			names.add(name);
		}
		
		//Closes the file
		inFile.close();
		
		//returns the names
		return names;
	}
}
