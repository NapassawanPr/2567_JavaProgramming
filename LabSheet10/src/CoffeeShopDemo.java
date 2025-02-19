import javax.swing.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon", 'M');
		Barista staff2 = new Barista("Claire", 'F');
		
		int type = Integer.parseInt(JOptionPane.showInputDialog("Input drink type : "));
		int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Input coffee type : "));
		char size = JOptionPane.showInputDialog("Enter coffee size :").charAt(0);
		int baristaNum = Integer.parseInt(JOptionPane.showInputDialog("Enter barista number : "));
		
		Barista selectedBarista;
		if (baristaNum == 2) {
		selectedBarista = staff2;
		} else {
		selectedBarista = staff1;
		}
	
		Coffee order = new Coffee(type,size, typeCoffee, selectedBarista);
		JOptionPane.showMessageDialog(null, order.toString() + "\nBarista: " + selectedBarista.getName() + " (" + selectedBarista.getGenderName() + ")");
	


	}

}
