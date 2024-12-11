import javax.swing.*;
public class Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10;
		final int CHOCOLATE = 15;
		final int TOPPING = 5;
		int price = 0;
		int choice;
		do {
		choice = Integer.parseInt(JOptionPane.showInputDialog(null, "[1]VanillaFlavor 10 B.\n[2]Chocolate Flavor 15 B.\nPress number to choose flavor:"));

		if(choice!=1&&choice!=2) {
		JOptionPane.showMessageDialog(null, "ERROR: Wrong choice!\nTry again...",
		"ERROR", JOptionPane.ERROR_MESSAGE);
		}

		}while(choice!=1&&choice!=2);

		price = (choice == 1) ? VANILLA : CHOCOLATE;
		int toppingChoice = JOptionPane.showConfirmDialog(null, "Do you want to add Topping?","Topping", JOptionPane.YES_NO_OPTION);
		int totalPrice = price + (toppingChoice == JOptionPane.YES_OPTION ? TOPPING : 0);
		String toppingMessage = (toppingChoice == JOptionPane.YES_OPTION) ? "Add with topping" : "Add no topping";
		
		JOptionPane.showMessageDialog(null, "You choose " + (price == VANILLA ? "Vanilla" : "Chocolate") + " Flavor\n" + toppingMessage + "\nTotal Price = " + totalPrice + " THB");

	}

}
