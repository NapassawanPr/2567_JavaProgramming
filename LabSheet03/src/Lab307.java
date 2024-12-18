import java.util.*;
public class Lab307 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Text: ");
		String textInput = input.nextLine().toLowerCase().replace(" ", "");
		

		boolean isPalindrome = false;
		int start = 0, end = textInput.length() - 1;

		while (start < end) {
		if (textInput.charAt(start) != textInput.charAt(end)) {
			isPalindrome = true;
			break;
		}
		start++;
		end--;
		}

		if (!isPalindrome) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

		input.close();

	}

}
