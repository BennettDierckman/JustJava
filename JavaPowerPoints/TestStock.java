public class TestStock {
	public static void main(String[] args) {
		// Create and output the first stock
		Stock oracle = new Stock("ORCL", "Oracle", 36.7, 40.2);		
		oracle.printStock();
		
		// Create and output the second stock
		Stock google = new Stock("GOOG", "Google", 295.9, 316.7);		
		google.printStock();
	}
}

class Stock {
	// Data fields for stocks go here
	// Take a look at the constructor to see what you need

	
	// Constructor
	Stock (String symbol, String name, double previousClosingPrice, double currentPrice){
		// Code for constructor goes here
		// Don't forget to use this.
	}
	
	// Printing method that displays all data fields
	void printStock() {
		// Code for printing a stock goes here
		// .printf can be handy for prices!
	}
}

