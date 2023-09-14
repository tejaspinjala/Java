/* Tejas Pinjala Chapter 6 Assignment 1
 * 
 * Instruction:
 * Write a class called Employee that includes three instance variables. Then demonstrate class by writing a 
 * separate program named EmployeeDemo that creates two Employee objects and display each object’s yearly salary. 
 * Then display again after giving them 5% raise.
*/

class Employee {
	private double monthlySalary;
	private String firstName;
	private String lastName;
	
	public Employee(double salary, String first, String last) {
		// Instance variables
		monthlySalary = salary;
		firstName = first;
		lastName = last;
	}
	
	// returns the monthly salary
	public double getEmployeeMonthlySalary() {
		return monthlySalary;
	}
	
	public void setEmployeeMonthlySalary(double salary) {
		if(salary < 0) {
			monthlySalary = 0;
		} else {
			monthlySalary = salary;
		}
	}
	
	// returns the first name
	public String fName() {
		return firstName;
	}
	
	public void setFName(String f) {
		firstName = f;
	}
	
	// returns the last name
	public String lName() {
		return lastName;
	}
	
	public void setLName(String l) {
		lastName = l;
	}
}
