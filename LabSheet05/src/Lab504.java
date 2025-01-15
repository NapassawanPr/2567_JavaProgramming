import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			scores[i] = input.nextDouble();
			sum += scores[i];
		}

		double average = sum / scores.length;
		
		System.out.printf("\nAverage of 5 students is %.2f\n", average);

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > average) {
				System.out.printf("> Student %d (%.2f)\n", i + 1, scores[i]);
			}
		}

		input.close();
		}

}
