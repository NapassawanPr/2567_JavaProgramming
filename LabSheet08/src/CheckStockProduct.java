import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many product list in stock: ");
		int numProducts = scan.nextInt();
		scan.nextLine();
		System.out.println();

		Product[] productList = new Product[numProducts];

		for (int i = 0; i < numProducts; i++) {
			productList[i] = new Product();

			System.out.print("Input product Id: ");
			productList[i].setId(scan.nextLine());

			System.out.print("Input product Unit: ");
			int unit = scan.nextInt();
			scan.nextLine();
			productList[i].setUnit(unit);
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		for (int i = 0; i < numProducts; i++) {
			if (productList[i].getUnit() < 5) {
				System.out.printf(">> %s has %d units\n", productList[i].getId(), productList[i].getUnit());
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		for (int i = 0; i < numProducts; i++) {
			if (productList[i].getUnit() >= 5 && productList[i].getUnit() < 50 ) {
				System.out.printf(">> %s has %d units\n", productList[i].getId(), productList[i].getUnit());
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		for (int i = 0; i < numProducts; i++) {
			if (productList[i].getUnit() >= 50 ) {
				System.out.printf(">> %s has %d units\n", productList[i].getId(), productList[i].getUnit());
			}
		}
	}
}
