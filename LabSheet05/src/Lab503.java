import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[7];
		int count = 0;
		String oddNumbers = "";

		for(int i = 0; i<nums.length;i++) {
			System.out.print("Input number " + (i+1) + " : ");
			nums[i] = input.nextInt();
		}


		for(int _nums : nums) {
			if(_nums%2!=0) {
				oddNumbers += _nums + " ";
				count++;
			}
		}
		
		System.out.println();
		System.out.println("There are " + count + " of odd number.\nList of odd number : " + oddNumbers.trim());

		input.close();
		}

}
