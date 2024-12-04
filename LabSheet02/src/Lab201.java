import javax.swing.*;
import java.text.DecimalFormat;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = numberOfCustomer*BUFFET;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int isMember;
		do {
		//System.out.printf("Total price is %,.2f baht.", totalPrice );
		 isMember = JOptionPane.showConfirmDialog(null, "Total price is " +frm.format(totalPrice)+" baht.\nDo you have a member card?");
		
		if(isMember==JOptionPane.YES_OPTION) { // member== 0 ; 0 = yes option
			double priceAfterDiscount = totalPrice * 0.90 ; // or totalprice- (totalprice*10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterDiscount) + " baht.");
		} else if (isMember==JOptionPane.NO_OPTION) { // member== 1 ; 1 = no option
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht.");
		}
		} while(isMember==JOptionPane.CANCEL_OPTION); // member== 2 ; 2 = cancel option
			 

		}

}
