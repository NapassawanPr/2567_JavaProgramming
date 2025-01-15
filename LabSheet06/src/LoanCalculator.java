
public class LoanCalculator {

	private String productName;
	private double price;
	private double interestRate;
	private int years;

	public void setLoanDetails(String name, double productPrice, double rate, int termInYear) {
		productName = name;
		price = productPrice;
		interestRate = rate;
		years = termInYear;
	}
	public double calculateMonthlyPayment() {
		double monthlyRate = (interestRate / 100) / 12 ;
		int totalMonths = years * 12;
		
		double monthlyPayment = (price * monthlyRate * Math.pow(1 + monthlyRate,totalMonths)) / ((Math.pow(1 + monthlyRate ,totalMonths)) - 1);
		return monthlyPayment;
	}
	
	public void displayLoanDetails() {
		double monthlyPayment = calculateMonthlyPayment();
		System.out.println("Product Name: " + productName);
		System.out.printf("Price: %.1f\n", price);
		System.out.printf("Interest Rate: %.1f%%\n", interestRate);
		System.out.println("Loan Period: " + years + " years");
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
	}

	
	
}
