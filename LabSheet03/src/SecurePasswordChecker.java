import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password (type 'exit' to quit):");
			String password = scan.nextLine();
			
			//Check if user want to exit
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			
			//Validate password
			String errors="";
			//check minimum length
			if(password.length()<8) {
				errors += "-Password must be at least 8 characters long.\n";
			}
			//Check for at least 1one digit, upper case, lower case
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i = 0 ; i<password.length();i++) {
				char chPass = password.charAt(i);		
				if(chPass>='A'&&chPass<='Z') {
					hasUpperCase = true;
				}
				else if(chPass>='a'&&chPass<='z') {
					hasLowerCase = true;
				}
				else if(chPass>='0'&&chPass<='9') {
					hasDigit = true;
				}
			}
			
			//Concatenate error based on missing criteria
			if(!hasUpperCase) {
				errors += "-Password must contain at least one uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				errors += "-Password must contain at least one lowercase letter(a-z).\n";
			}
			
			if(!hasDigit) {
				errors += "-Password must contain at least one digit (0-9).\n";
				
			}
			
			//Display error or succuss meessage
			if(errors.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			} else {
				System.out.println("Your validation errros.");
				System.out.println(errors);
			}
			
					
		}// end of while
		scan.close();

	}

}
