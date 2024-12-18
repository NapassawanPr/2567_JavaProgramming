import javax.swing.*;
public class Lab401 {

	//main() method
	public static void main(String[] args) {
		inputEmail();

	} // end of main
	
	//inputEmail() method
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail: ");
			if(varEmail != null&& !varEmail.isEmpty()) {
				checkEmailError(varEmail);
				
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]:");
			
		}while(ans != null && ans.equalsIgnoreCase("y"));
		
	} // end of inputEMail()
	
	//checkEmailError() method
	public static void checkEmailError(String email) {
		while (email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid email. Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email) ? "Your email is" + email : "Your e-mail is not a gmail or hotmail address.");
		
	} // end of checkEmailError()
	
	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/
		/*if(email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")) {
			return true;
		}
		return false; */
		
		return email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com");
	
		
	} // end of checkEmail()
 
}
