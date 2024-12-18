import java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input your message: ");
		String message = input.nextLine().toLowerCase();

		if ((message.indexOf("nichi")>=0)) {
			System.out.println("Nichi is a sentence");
		} else {
			System.out.println(message);
		}

		input.close();
		

	}

}
