import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numProducts = 4;
		Product[] productList = new Product[numProducts];
		
		for (int i = 0; i < numProducts; i++) {
			productList[i] = new Product();

			System.out.print("Input product Id: ");
			productList[i].setId(scan.nextLine());

			System.out.print("Input product Unit: ");
			int unit = scan.nextInt();
			while (unit <= 0) {
			System.out.print("Input product Unit, again: ");
			unit = scan.nextInt();
			}
			productList[i].setUnit(unit);
			
			scan.nextLine();
			
			System.out.print("Input product Price: ");
			double price = scan.nextDouble();
			while (price <= 0) {
			System.out.print("Input product Price, again: ");
			price = scan.nextDouble();
			}
			productList[i].setPrice(price);
			scan.nextLine();
			System.out.println();	
			
		}
		
		System.out.println("-------------------------------------------------------");
		double totalPrice = 0;
		System.out.println();
		System.out.println("-------------------------------------------------------");
		for (Product product : productList) {
			double productTotal = product.calculate();
			totalPrice += productTotal;
			System.out.printf("Product ID : %s, Total price = %,.2f baht.\n", product.getId(), productTotal);
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.printf("Total price of all products is %,.2f baht.\n", totalPrice);		
		
		scan.close();
		
	}
		
	

}
