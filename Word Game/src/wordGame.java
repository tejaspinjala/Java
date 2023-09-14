import java.util.Scanner;

public class wordGame {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in); //scanner
		
		//inputs
		String name; //gets the person's name
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		
		int age; //gets the person's age 	
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		keyboard.nextLine();
		
		String city; //gets the city 
		System.out.print("Enter the name of a city: "); 
		city = keyboard.nextLine();
		
		String college; //gets the college name
		System.out.print("Enter the name of a college: ");
		college = keyboard.nextLine();
		
		String profession; //gets the person's profession
		System.out.print("Enter profession: ");
		profession = keyboard.nextLine();
		
		String animal; //gets the type of pet 
		System.out.print("Enter a type of animal: ");
		animal = keyboard.nextLine();
		
		String petname; //gets the pet name
		System.out.print("Enter a pet name: ");
		petname = keyboard.nextLine();

		
		System.out.println("\nThere once was a person named " + name + " who lived in " + city + ". " +
		"At the age of " + age + ",\n" + name + " went to college at " + college + ". " +
		name + " graduated and went to work as a \n" + profession + ". Then, " + name + " adopted a(n) " 
		+ animal + " named " + petname + ". They both lived \nhappily ever after!\n");
		}
	}

