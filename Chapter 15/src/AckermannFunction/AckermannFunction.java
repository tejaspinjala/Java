/*
 * Tejas Pinjala Chapter 15
 * COSC - 2436
 * Professor Woods
 * 03/02/2021
 * 
 * Ackermann's Function:
 * Ackermann’s function is a recursive mathematical algorithm that can be used to test how well
 * a computer performs recursion. Write a method ackermann(m, n), which solves Ackermann’s
 * function.
 */

package AckermannFunction;

public class AckermannFunction {
	//main method
	public static void main(String [] args) {
		//tests the program and displays the return values
		System.out.println(ackermann(0, 0));
		System.out.println(ackermann(0, 1));
		System.out.println(ackermann(1, 1));
		System.out.println(ackermann(1, 2));
		System.out.println(ackermann(1, 3));
		System.out.println(ackermann(2, 2));
		System.out.println(ackermann(3, 2));
	}
	
	public static int ackermann(int m, int n) {
		//logic to perform the recursive mathematical algorithm
		if(m == 0) {
			return n + 1;
		} else if(n == 0) {
			return ackermann(m - 1, 1);
		} else {
			return ackermann(m - 1, ackermann(m, n - 1));
		}
	}
}
