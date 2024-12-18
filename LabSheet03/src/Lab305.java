import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence;

		while (true) {
		System.out.print("Input some sentence: ");
		sentence = input.nextLine();

		if (sentence.endsWith(".")) {
		break;
		}
		System.out.println("The sentence with full stop point: " + sentence);
		}

		System.out.println();
		int start = 0;
		for (int i = 0; i <= sentence.length(); i++) {
		if (i == sentence.length() || sentence.charAt(i) == ' ') {
		System.out.println(sentence.substring(start, i));
		start = i + 1; 
		}
		}

		input.close();

	}

}
