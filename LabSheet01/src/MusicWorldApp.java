import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String cdId, cdTitle;
        int cdQuantity;
        double cdPrice, cdSubtotal, cdTotal;

        cdId =  JOptionPane.showInputDialog(null,"This program calcurates the total cost of a CD order\nPlease enter the ID of the CD","Input",JOptionPane.QUESTION_MESSAGE);
        cdTitle =  JOptionPane.showInputDialog(null,"Please enter the title of the CD","Input",JOptionPane.QUESTION_MESSAGE);
        String strPrice =  JOptionPane.showInputDialog(null,"Please enter the price of the CD in U.S. dollars","Input",JOptionPane.QUESTION_MESSAGE);
        cdPrice = Double.parseDouble(strPrice);
        String strQuantity =  JOptionPane.showInputDialog(null,"Please enter the quantity to be purchased","Input",JOptionPane.QUESTION_MESSAGE);
        cdQuantity = Integer.parseInt(strQuantity);

        cdSubtotal = cdPrice*cdQuantity;
        final double TAX_RATE = 6.25;
        cdTotal = cdSubtotal+(cdSubtotal*TAX_RATE/100);

        String message = String.format("Summaryof the transaction:\n\nCD ID: %s\nCD Title: %s\nCD Unit Price $%.2f\nCd Quantity: %d\n\nSubtitle: $%.1f\nTax rate: $%.2f%%\nTotal: $%f\n\nEnd of Program",cdId,cdTitle,cdPrice,cdQuantity,cdSubtotal,TAX_RATE,cdTotal);
        JOptionPane.showMessageDialog(null, message); 
	}

}
