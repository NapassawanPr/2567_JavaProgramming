import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];

		for(int i = 0; i<nums.length;i++) {
			System.out.print("Input number " + (i+1) + " : ");
			nums[i] = input.nextInt();

		}

		System.out.println();
		System.out.println("Summation of positive number is " + sumOfPos(nums));


		input.close();


		}
	public static int sumOfPos(int[] nums) {

		int sum = 0;
		
		for(int i = 0 ; i< nums.length;i++) {
			if(nums[i]>0) {
				sum+=nums[i];
			}
		}
		return sum;

		
	}

}
