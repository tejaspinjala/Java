import java.util.Scanner;

public class StudentAverageTestScore {
	
	final int STUDENTS = 10;
	final int TESTS = 3;
	
	Scanner keyboard = new Scanner(System.in);
	
	String[] names = new String[STUDENTS];
	double[][] scores = new double[STUDENTS][TESTS];
	
	public void main(String [] args) {
		
		String studentName = getName(names);
		
		for (int row = 0; row < STUDENTS; row++)
	     {
	         for (int col = 0; col < TESTS; col++)
	         {
	            System.out.printf("For students %d, enter Test score %d: ", row + 1, col + 1);
	            scores[row][col] = keyboard.nextInt();
	            //while()
	            // implement input validation using while loop
	          }
	      }
	      System.out.println();
	}

	
	public String getName(String [] names) {
		int i;
		for(i = 0; i < STUDENTS ; i++)
	      	System.out.printf("Enter the name of student %d: ", i + 1);
	      	names[i] = keyboard.nextLine();
	        return names[i];
	}
	
	
	//public double calTestAverage(double [] test) {
		
	//}
}

