import java.util.Scanner;


public class EmployeeTest {
	public static void main(String [] args) {
		
		// Scanner
		Scanner keyboard = new Scanner(System.in);
		
		double monthlySalary;
		String f;
		String l;
		
		// Asks for the first employee info
		System.out.println("Please enter the first employees details");
		System.out.println("First Employee's first name: ");
		f = keyboard.nextLine();
		System.out.println("First Employee's last name: ");
		l = keyboard.nextLine();
		System.out.println("First Employee's monthly salary: ");
		monthlySalary = keyboard.nextDouble();
		Employee Employee1 = new Employee(monthlySalary, f, l);
		
		// Asks for the second employee's info
		System.out.println("\nPlease enter the second employees details");
		System.out.println("Second Employee's first name: ");
		f = keyboard.nextLine();
		System.out.println("Second Employee's last name: ");
		l = keyboard.nextLine();
		System.out.println("Second Employee's monthly salary: ");
		monthlySalary = keyboard.nextDouble();
		Employee Employee2 = new Employee(monthlySalary, f, l);
		
		
		// Prints the employee's name and salary
		System.out.println("\nEmployee 1: " + Employee1.fName() + " " + Employee1.lName() + "; Yearly Salary: " + (Employee1.getEmployeeMonthlySalary() * 12));
		System.out.println("Employee 2: " + Employee2.fName() + " " + Employee2.lName() + "; Yearly Salary: " + (Employee2.getEmployeeMonthlySalary() * 12));
		
		// Prints the calculated name and salary after the 5% raise
		System.out.println("\nSalary after the 5% raise");
		System.out.println("Employee 1: " + Employee1.fName() + " " + Employee1.lName() + "; Yearly Salary: " + ((Employee1.getEmployeeMonthlySalary() * 12 * 5 / 100) + Employee1.getEmployeeMonthlySalary()));
		System.out.println("Employee 2: " + Employee2.fName() + " " + Employee2.lName() + "; Yearly Salary: " + ((Employee2.getEmployeeMonthlySalary() * 12 * 5 / 100) + Employee2.getEmployeeMonthlySalary()));
		
	}
}
