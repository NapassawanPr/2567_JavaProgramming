import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = {78, 36, 58, 41, 25, 92, 75};

		System.out.print("Input index of array: ");
		int index = input.nextInt();

		while (index < 0 || index >= numbers.length) {
			System.out.print("Input index of array, again: ");
			index = input.nextInt();
		}

		System.out.println();
		System.out.println("Value in current index is " + numbers[index]);

		if (index < numbers.length - 1) {
			System.out.println("Value in next index is " + numbers[index + 1]);
		} else {
			System.out.println("Sorry, " + index + " is the last index in array.");
		}

		input.close();

	}

}
