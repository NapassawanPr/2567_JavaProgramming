import javax.swing.*;
public class javaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String productName = JOptionPane.showInputDialog("Input product Name : ");
		String strProducUnit = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(strProducUnit);
		
		double productPrice =  Double.parseDouble(JOptionPane.showInputDialog("Input price per unit : "));
		
		double totalPriceOfProduct = productUnit * productPrice;	
		String frmTotal = String.format("%,.2f",totalPriceOfProduct); 
		double totalWithVat = totalPriceOfProduct+ 1.07;
		String frmTotalWithVat = String.format("%,.2f",totalWithVat); 
		JOptionPane.showMessageDialog(null, "Total price is " + frmTotal + " baht." + "\nAdd VAT 7% is " + frmTotalWithVat + " baht.");
	}

}
