import javax.swing.*;
public class Shop100Baht {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?", "Branch Selection", JOptionPane.YES_NO_OPTION);
		Product sold;

		if (option == JOptionPane.YES_OPTION) {
			sold = new PattanakarnBranch();
		} else {
			sold = new Product();
		}

		String input = JOptionPane.showInputDialog("Input the number of product:");
		int units = Integer.parseInt(input);
		sold.setUnit(units);
		
		
		JOptionPane.showMessageDialog(null, sold);
		}

	

}
