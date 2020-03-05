package mathpow;

public class Interest {

	public static void main(String[] args) {
		
		double principle = 100.0;
		double rate = 0.05;
		
		//display headers
		System.out.printf("%s%20s%n","Year", "Amount on deposit");
		
		for(int year = 1; year <=10; ++year) {
			double amount = principle * Math.pow(1.0 + rate, year);
			
			//display the year and the amount
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
		
	}

}
