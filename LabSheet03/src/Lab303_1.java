import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		int countSpace=0;
		
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
		}
		
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)== ' ') {
				countSpace++;
			}
		}

		JOptionPane.showMessageDialog(null, "This sentence has " + countSpace + " spacebar.\n" + "This sentence has " + (countSpace+1) + " word.");


	}

}
