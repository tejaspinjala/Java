/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 8
 * COSC - 1437
 * Professor Woods
 * 11/11/2020
 * 
 * Preferred Customer
 */

package PreferredCustomer;

// class inherited from the Customer class
public class PreferredCustomer extends Customer{
	
	// declares the doubles to store the purchase amount
	private double moneySpent;
	
	// calls the super class and refers to the moneySpent and offer variables
	public PreferredCustomer(String name, String address, String telephone, int customerID, boolean emailList, double moneySpent) {
		super(name, address, telephone, customerID, emailList);
		this.moneySpent = moneySpent;

	}
	
	// calculates the about of discount that should be given based on the money spent
	public double discount() {
		double offer = 0.0;
		
		if(moneySpent >= 500.0 && moneySpent < 1000.0) {
			offer = 0.05;
		} else if (moneySpent >= 1000.0 && moneySpent < 1500.0){
			offer = 0.06;
		} else if (moneySpent >= 1500.0 && moneySpent < 2000.0) {
			offer = 0.07;
		} else if (moneySpent >= 2000.0 && moneySpent < 2500.0) {
			offer = 0.10;
		}
		
		return offer * 100;
	}
	
	// returns the money spent on the purchase and the discounted value
	public String stringReturn() {
		return super.toString() + 
				"\nMoney spent on purchase: " + moneySpent +
				"\nThe discount percent: " + String.format("%.2f", discount());
	}
	
	
	
}
