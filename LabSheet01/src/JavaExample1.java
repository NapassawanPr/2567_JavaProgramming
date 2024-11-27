import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//กำหนด object ในการรับข้อมูลทางคีย์บอร์ด
		Scanner input = new Scanner(System.in);
		//กำหนด object ในการจัดรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		//รับและแสดงผลชื่อสินค้า
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		
		//แสดงและรับข้อมูลราคาสินค้า
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println(); //เว้นบรรทัด
		
		//คำนวณราคารวมสินค้า
		float totalPriceOfProduct = productUnit * productPrice;	
		System.out.println("Total price is " + frm.format(totalPriceOfProduct) + " bant.");
		
		//คำนวณราคารวมสินค้าบวกภาษี
		float totalWithVat = totalPriceOfProduct+(totalPriceOfProduct*7/100); // or 1.07f
		System.out.println("Add vat 7% is " + frm.format(totalWithVat) + " bant.");
		
		System.out.println(); //เว้นบรรทัด	
		// output using String.Format and printf
		String frmTotalWithVat = String.format("%,.2f",totalWithVat); 
		System.out.println("output using String.Format");
		System.out.println("Add vat 7% is " + frmTotalWithVat + " bant.");
		
		System.out.println(); //เว้นบรรทัด
		System.out.println("output using printf");
		System.out.printf("Add vat 7%% is %,.2f bant. ", totalWithVat);
		
		input.close();
		

	}

}
