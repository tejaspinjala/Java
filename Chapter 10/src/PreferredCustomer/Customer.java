/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 8
 * COSC - 1437
 * Professor Woods
 * 11/11/2020
 * 
 * Preferred Customer
 */

package PreferredCustomer;

public class Customer {
	// holds the customers name, address, telephone, ID and the email list info
	private String name;
	private String address;
	private String telephone;
	private int customerID;
	private boolean emailList;
	
	// refers to the local variable
	public Customer(String name, String address, String telephone, int customerID, boolean emailList) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.customerID = customerID;
		this.emailList = emailList;
	}
	
	// returns the stored name, address, telephone, ID, and the email list info
	public String toString() {
		return "Customer Name: " + name +
				"\nAddress: " + address +
				"\nTelephone: " + telephone +
				"\nCustomer ID: " + customerID +
				"\nEmail List: " + emailList;
	}
}
