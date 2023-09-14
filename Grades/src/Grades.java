import java.util.Scanner;

public class Grades {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		double testScore1, testScore2, testScore3, average;
		
		System.out.println("Enter your 1st test score: ");
		testScore1 = scanner.nextDouble();
		
		System.out.println("Enter your 2nd test score: ");
		testScore2 = scanner.nextDouble();
		
		System.out.println("Enter your 3rd test score: ");
		testScore3 = scanner.nextDouble();
		
		average = (testScore1 + testScore2 + testScore3) / 3;
		
		if(average < 60) {
			
			System.out.printf("The average score is: %f. You got a grade F.", average);
			
		} else if (average < 70) {
			
			System.out.printf("The average score is: %f. You got a grade D.", average);
			
		} else if (average < 80) {
			
			System.out.printf("The average score is: %f. You got a grade C.", average);
			
		} else if (average < 90) {
			
			System.out.printf("The average score is: %f. You got a grade B.", average);
			
		} else if (average <= 100) {
			
			System.out.printf("The average score is: %f. You got a grade A.", average);
			
		} else {
			
			System.out.printf("The average score is: %f. This is not a valid grade", average);
			
		}
		
	}
}
