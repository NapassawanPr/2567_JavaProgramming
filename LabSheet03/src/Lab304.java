import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		
		String [] splitName = fullName.split(" ");
		
		if(splitName.length==2) {
			String firstName = splitName[0];
			String LastName = splitName[1];
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + LastName);
			
		} else {
			System.out.println("Incorrect Name");
		}
		
		input.close();

	}

}
