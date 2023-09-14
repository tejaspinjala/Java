/* Instruction:
 * 	Write a class that contains the following two methods. This program will convert the feet to
	meters and meters to feet. 
	
	footToMeter – This method should accept a foot as an argument, and the argument
		should convert to meters. Covert the feet to meters using the following formula:
		meter = foot * 0.305
	 meterToFoot – This method should accept a meter as an argument, and the argument
	 	convert to feet. Convert the meters to feet using the following formula:
		feet = meter * 3.281
 */

public class pinjalaConversions {
	
	public static void main(String [] args) {
		System.out.printf("%4s%10s%15s%10s\n", "Feet", "Meters", "Meters", "Feet");
	    System.out.println("---------------------------------------------");

	    double foot = 1; // Initializes foot double
	    double meter = 10; // Initializes meter double
	    
	    // This runs through the loop and prints the calculated feet and meters
	    for (int i = 1; i <= 5; foot++, meter += 10, i++) {
	      System.out.printf("%4.1f%10.3f%15.1f%10.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
	    }
	  }

	
	// Converts from meters to feet
	public static double meterToFoot(double meter) {
		// Returns the value after converting from meters to feet
		return meter / 0.305;
	}
	
	
	// Converts from feet to meters
	public static double footToMeter (double foot) {
		// Returns the value after converting from feet to meter
	    return 0.305 * foot;
	}
}
