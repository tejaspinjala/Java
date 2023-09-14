// Tejas Pinjala Chapter 8 Pg: 552 Problem # 3 cont.

import java.util.Scanner;

public class RoomCarpet {
	private static RoomDimension size;
	private static double carpetCost;
	
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in);
		
		double l, w, c;
		
		System.out.println("Enter the Length: ");
		l = keyboard.nextDouble();
		
		System.out.println("Enter the Width: ");
		w = keyboard.nextDouble();
		
		System.out.println("Enter the Carpet cost per sq inch: ");
		c = keyboard.nextDouble();
		
		RoomDimension rd = new RoomDimension(l, w);
		
		System.out.println("The total cost for the carpet is: " + (rd.getArea() * c));
		
	}
	
	public RoomCarpet(RoomDimension dim, double cost) {
		size = dim;
		carpetCost = cost;
	}
	
	public static double getTotalCost() {
		return carpetCost * size.getArea();
	}

}

