import javax.swing.*;
public class Lab506 {

	public static void main(String[] args) {
		String[] messages = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		String showMessage = "The greeting words in English:\n";

		for (String message : messages) {
		showMessage += "- " + message + "\n";
		}

		JOptionPane.showMessageDialog(null, showMessage, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}


