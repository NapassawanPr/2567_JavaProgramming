import java.util.*;
public class TestProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product product = new Product();

		System.out.print("Enter product name: ");
		String name = scan.nextLine();

		System.out.print("Enter product price: ");
		double price = scan.nextDouble();

		System.out.print("Enter VAT rate (%): ");
		double vatRate = scan.nextDouble();

		product.setProductDetails(name, price, vatRate);

		System.out.println();
		product.displayProductDetails();

		scan.close();

	}

}
