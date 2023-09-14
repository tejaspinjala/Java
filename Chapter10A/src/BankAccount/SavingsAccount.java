/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 9
 * COSC - 1437
 * Professor Woods
 * 11/18/2020
 * 
 * BankAccount and SavingsAccount Classes
 */

package BankAccount;

//declares the SavingsAccount class that extends from BankAccount class
public class SavingsAccount extends BankAccount{
	
	//decares a boolean named activity to check if the account is active or not
	private boolean activity;
	
	//declares the constructor that accepts balance and rate 
	public SavingsAccount(double balance, double rate) {
		super(balance, rate);
		if(balance > 25 ) {
			activity = true;
		} else {
			activity = false;
		}
	}
	
	//declares a method that checks if the account is active or not when making a withdrawl and calls the super class if its active
	public void withdraw(double withdrawl) {
		if(activity) {
			super.withdraw(withdrawl);
		}
		if(balance < 25) {
			activity = false;
		}
	}
	
	//declares a method that checks if the account is active or not when making a deposit and calls the super class if the account is active
	public void deposit(double deposit) {
		if(!activity) {
			if(balance + deposit >= 25) {
				activity = true;
			}
			super.deposit(deposit);
		} else {
			super.deposit(deposit);
		}
	}
	
	//declares a method that processes the monthly payment based on the withdrawls and the interest
	public void monthlyProcess() {
		if(withdrawls > 4) {
			monthlyServiceCharge += 1;
		}
		balance -= monthlyServiceCharge;
		calcInterest();
		if(balance < 25) {
			activity = false;
		}
		
		depositsPerMonth = 0;
		withdrawls = 0;
	}
	
	//prints out the name, balance and the status
	public void output() {
		System.out.println("\nName: " + name);
		System.out.println("Balance: $" + balance);
		if(activity) {
			System.out.println("Status: Active.");
		} else {
			System.out.println("Status: Inactive.");
		}
	}
}
