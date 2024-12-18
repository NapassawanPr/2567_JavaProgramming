import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		int year;
		while(true) {
			year = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
			
			 while (!checkYear(year)) {
		            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year, again:"));
		        }
			 
			if (checkYear(year)) {
				if (isLeapYear(year)) {
					JOptionPane.showMessageDialog(null, year + " is Leap year.");
			} else {
				JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
			}
				break;
			} 

		}

	} // end of main()
	
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0  ) {
				return true;
			}
		}
		return false;
	} // end of isLeapYear()
	
	public static boolean checkYear(int year) {
		return year >= 1000 && year <= 3000;
		
	} // end of checkYear()

}
