/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 9
 * COSC - 1437
 * Professor Woods
 * 11/18/2020
 * 
 * BankAccount and SavingsAccount Classes
 */

package BankAccount;

//declares the abstract BankAccount class
public abstract class BankAccount {
	//declares the modifiers to hold the required data
	protected double balance;
	protected int depositsPerMonth = 0;
	protected int withdrawls = 0;
	protected double annualInterestRate;
	protected double monthlyServiceCharge = 0;
	protected String name;
	
	//declares the constructor that accepts balance and the annual interest rate
	public BankAccount(double balance, double annualInterestRate){
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//declares a method that accepts the deposit and adds it to the balance, also increments the deposits
	public void deposit(double amountOfDeposit) {
		this.balance += amountOfDeposit;
		depositsPerMonth++;
	}
	
	//declares a method that accepts the withdrawl and subtracts it from the balance, also increments the withdrawl
	public void withdraw(double amountOfWithdrawl) {
		if(balance >= amountOfWithdrawl) {
			this.balance -= amountOfWithdrawl;
			withdrawls++;
		}
	}
	
	//declares a method that updates the balance by calculating the monthly interest rate and adds interest to the balance
	public void calcInterest() {
		double monthlyInterestRate, monthlyInterest;
		
		monthlyInterestRate = (annualInterestRate / 12);
		monthlyInterest = balance * monthlyInterestRate;
		balance = balance + monthlyInterest;	
	}
	
	//declares a method that subtracts the monthly service charge, calls the calcInterest() method and sets the variables
	public void monthlyProcess() {
		balance -= monthlyServiceCharge;
		calcInterest();
		depositsPerMonth = 0;
		withdrawls = 0;
		monthlyServiceCharge = 0;
	}
	
	//declares a method that returns the balance
	public double getBalance() {
		return balance;
	}
	
	//declares a method that gets the name
	public void setName(String name) {
		this.name = name;
	}

}
