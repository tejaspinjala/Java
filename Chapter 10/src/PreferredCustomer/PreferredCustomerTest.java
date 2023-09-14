/* 
 * Tejas Pinjala Chapter 10 Pg: 698 Problem # 8
 * COSC - 1437
 * Professor Woods
 * 11/11/2020
 * 
 * Preferred Customer
 */

package PreferredCustomer;

public class PreferredCustomerTest {
	public static void main(String [] args) {
		// main method containing the customer info
		PreferredCustomer Customer1 = new PreferredCustomer("Bob Allen", "5123 New Castle", "924-234-9846", 1, true, 1120);
		System.out.println(Customer1.stringReturn());
		System.out.println();
		
		PreferredCustomer Customer2 = new PreferredCustomer("Joe Robinson", "523 Castle Road", "784-134-6746", 2, false, 2002);
		System.out.println(Customer2.stringReturn());
		System.out.println();
		
		PreferredCustomer Customer3 = new PreferredCustomer("Trish Park", "799 Prairie View", "324-234-9846", 3, true, 650);
		System.out.println(Customer3.stringReturn());
		System.out.println();
	}
}
