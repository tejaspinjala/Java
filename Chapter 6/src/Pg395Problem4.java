/*
 * Tejas Pinjala Chapter 6 Pg: 395 Problem # 4
 * 
 * Instruction RetailItem Class:
 * Write a class named RetailItem that holds data about an item in a retail store. The class 
 * should have the following fields:
 * 	• description. The description field references a String object that holds a brief 
 * 	description of the item.
 * 	• unitsOnHand. The unitsOnHand field is an int variable that holds the number of units 
 * 	currently in inventory.
 * 	• price. The price field is a double that holds the item’s retail price.
 * 
 */

public class Pg395Problem4 {
	public static void main(String [] args) {
		//Creates item1 object
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		//Creates item2 object
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		//Creates item3 object
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		//Prints out the stored data
		System.out.println("\t\tDescription\tUnits On Hand\tPrice");
		System.out.println("Item # 1\t" + item1.getDescription() + "\t\t\t" + item1.getUnitsOnHand() + "\t$" + item1.getPrice());
		System.out.println("Item # 2\t" + item2.getDescription() + "\t\t" + item2.getUnitsOnHand() + "\t$" + item2.getPrice());
		System.out.println("Item # 3\t" + item3.getDescription() + "\t\t\t" + item3.getUnitsOnHand() + "\t$" + item3.getPrice());
	}
}

class RetailItem {
	public String description;
	public int unitsOnHand;
	public double price;
	
	//Takes in userDes parameter and assigns it to description
	public void setDescription(String userDes) {
		description = userDes;
	}
	
	//Returns description
	public String getDescription() {
		return description;
	}
	
	//Takes in units parameter and assigns it to UnitsOnHand
	public void setUnitsOnHand(int units) {
		unitsOnHand = units;
	}
	
	//Returns unitsOnHand
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	
	//Takes the money parameter and assigns it to price
	public void setPrice(double money) {
		price = money;
	}
	
	//Returns price
	public double getPrice() {
		return price;
	}
	
	//Assigns the parameters to variables
	public RetailItem(String des, int unit, double pri) {
		description = des;
		unitsOnHand = unit;
		price = pri;
	}
}
