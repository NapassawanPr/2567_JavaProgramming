import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName; // The input line entered by the user.
		String firstName;
		// The first name, extracted from the input.
		
		System.out.println("Please enter your name, sperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' '); // find spacebar
		firstName = fullName.substring(0,space);
		
		System.out.println(abbreviatName(fullName) + firstName);
		input.close();

	}// end of main()
	
	public static String abbreviatName(String fName) {
		String initialLetter="";
		for(int i = 0; i< fName.length();i++) {
			if(fName.charAt(i) ==' ') {
				initialLetter= (initialLetter+fName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter+".";
			}
		} // end for
		
		return initialLetter;
		
	} // end of abbreviatName()

}
