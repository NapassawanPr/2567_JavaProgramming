import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Product Name: ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Price per unit : ");
		double pricePerUnit = input.nextDouble();
		
		System.out.println("------------------------------------");
		double total = productUnit * pricePerUnit;	
		System.out.printf("Total price is %,.2f baht. ", total);	

		System.out.println("\n------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("------------------------------------");
		
		double totalWithDiscount = total*discount/100;
		double amount = total-totalWithDiscount;
		System.out.printf("Discount from 15%% \t %,.2f baht. ", totalWithDiscount);	
		System.out.printf("\nAmount to be paid\t %,.2f baht. ", amount);	
		
		input.close();
	}

}
