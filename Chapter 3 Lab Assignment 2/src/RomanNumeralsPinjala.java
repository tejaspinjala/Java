	import java.util.Scanner;

public class numToNumerals {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter a number in the range of 1 - 10: ");
			int num = scanner.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
			default:
				System.out.println("This is not valid. Run the program again.");
			}
			
	}
}
