/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 9
 * COSC - 1437
 * Professor Woods
 * 11/18/2020
 * 
 * BankAccount and SavingsAccount Classes
 */

package BankAccount;

//declares a BankAccoutTest class that runs the program
public class BankAccountTest {
	public static void main(String [] args) {
		
		//declares a new SavingsAccount and gives it an intial balance and rate
		SavingsAccount account1 = new SavingsAccount(3000, 0.3);
		
		//adds the name
		account1.setName("Bob Allen");
		account1.output();
		
		//withdraws money from the account
		System.out.println("\nWithdrawing $2977");
		account1.withdraw(2977);
		account1.output();
		
		//deposits money in the account
		System.out.println("\nDeposit $200");
		account1.deposit(200);
		account1.output();
		
		//withdraws more money from the account without enough balance and it gets cancelled
		System.out.println("\nWithdrawing $300");
		account1.withdraw(300);
		account1.output();
		
		//deposits money again
		System.out.println("\nDeposit $520");
		account1.deposit(520);
		account1.output();
		
		//processes the entire months payments and adds the interest
		account1.monthlyProcess();
		account1.output();	
		
	}
}
