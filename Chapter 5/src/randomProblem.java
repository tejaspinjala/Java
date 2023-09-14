import java.util.Scanner;

public class randomProblem {
	public static void main(String [] args) {
		int time;
		int wholeHours;
		int wholeMinutes;
		double hours;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		time = keyboard.nextInt();
		
		wholeHours = time / 60;
		
		wholeMinutes = time % 60;
		
		hours = (double) time / 60;
		
		System.out.println(time + " = " + hours + " hours");
		System.out.println(time + " = " + wholeHours + " hours " + wholeMinutes + " minutes");
	}
	
}
