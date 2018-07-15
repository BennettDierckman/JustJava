package LECTURE.Lecture7;

public class TestStock {
	public static void main(String[] args) {
		Stock oracle = new Stock("ORCL", "Oracle", 36.7, 40.2);
		oracle.printStock();
		
		Stock google = new Stock("GOOG", "Google", 295.9, 316.7);
		google.printStock();
	}
}

class Stock{
	String name = "";
	String symbol = "";
	double currentPrice = 0;
	double previousPrice = 0;
	
	//empty constructor
	Stock(){
	}
	
	//argument accepting constructor
	Stock(String symbol, String name, double previousPrice, double currentPrice){
		this.name = name;
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		this.previousPrice = previousPrice;
	}
	
	void printStock() {
		System.out.printf("%s : %s\n", name, symbol);
		System.out.printf("Current Price: %4.2f   Yesterday's Price: %4.2f\n", currentPrice, previousPrice);
		double priceChange = ((currentPrice * 100) / previousPrice) - 100;
		System.out.printf("Thee change in price is %4.2f percent\n\n", priceChange);
	}
	
}
