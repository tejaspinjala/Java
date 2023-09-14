/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 03/10/2021
 * Customer Updater:
 * Write an application that connects to the CoffeeDB database, and allows the
 * user to select a customer, then change any of that customer’s information.
 */

package Chapter17;

import java.util.Scanner;
import java.sql.*;

public class CustomerUpdater {
	public static void main(String [] args) throws Exception{
		final String DB_URL = "jdbc:derby:CoffeeDB";
		String num;
		double price;
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
			Connection con = DriverManager.getConnection(DB_URL);
			Statement stmt = con.createStatement();
			System.out.print("Enter the product number: ");
			num = keyboard.nextLine();
			
			if (findAndDisplayProduct(stmt, num)){
				System.out.print("Enter the new price: ");
				price = keyboard.nextDouble();
				updatePrice(stmt, num, price);
			} else {
				System.out.println("That product was not found.");
			}

			con.close();
			
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
	
	public static boolean findAndDisplayProduct(Statement stmt, String prodNum) throws SQLException {
		boolean productFound;
		String sqlStatement = "SELECT * FROM Coffee WHERE ProdNum = '" + prodNum + "'";
		ResultSet result = stmt.executeQuery(sqlStatement);

		if (result.next()) {
			System.out.println("Description: " + result.getString("Description"));
			System.out.println("Product Number: " + result.getString("ProdNum"));
			System.out.println("Price: $" + result.getDouble("Price"));
			productFound = true;
		} else {
			productFound = false;
		}

		return productFound;
	}

	public static void updatePrice(Statement stmt, String prodNum, double price) throws SQLException {
		String sqlStatement = "UPDATE Coffee " + "SET Price = " + Double.toString(price) + "WHERE ProdNum = '" + prodNum + "'";
		int rows = stmt.executeUpdate(sqlStatement);
		System.out.println(rows + " row(s) updated.");
	}	
}
