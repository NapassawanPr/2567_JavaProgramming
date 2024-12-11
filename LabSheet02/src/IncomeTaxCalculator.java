import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		//Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;

		// Declare variables
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the taxable income: $");
		int taxableIncome = input.nextInt();
		double taxPayable;

		if (taxableIncome <= 20000) { // [0, 20000]
		taxPayable = 0.0;
		} else if (taxableIncome <= 40000) { // [20001, 40000]
		taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
		} else if (taxableIncome <= 60000) { // [40001, 60000]
		taxPayable = 20000 * TAX_RATE_ABOVE_20K +
		(taxableIncome - 2 * 20000) * TAX_RATE_ABOVE_40K;
		} else { // [60001, ]
		taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K + (taxableIncome - 3 * 20000) * TAX_RATE_ABOVE_60K;
		}

		System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

		input.close();

	}

}
