import javax.swing.*;

public class Lab302_1 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ");

		while(inputEmail.startsWith("@")|| inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		
		while(true) {
			if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
					JOptionPane.showMessageDialog(null,"Your e-mail is " + inputEmail);
					break;		
			} else {
				JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com " );
				inputEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
			}
		}
	}
}

	
