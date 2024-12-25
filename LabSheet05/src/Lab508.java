import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		 int[] nums = {25, 78, 41, 22, 36, 85, 37};

		 int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		 
		 while(!checkIndex(nums,index)) {
			 index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		 }
		 
		 String previous = (index > 0) ? "Previous data, nums[" + (index - 1) + "] is " + prevData(nums, index) : "No previous data";
	     int current = currentData(nums, index);
	     String next = (index < nums.length - 1) ? "Next data, nums[" + (index + 1) + "] is " + nextData(nums, index) : "No next data";

		 JOptionPane.showMessageDialog(null, "Current data, nums[" + index + "] is " + current + "\n" + previous + "\n " + next );

	}
	public static boolean checkIndex(int[] nums, int index){
		return index >= 0 && index < nums.length;
	}
	
	public static int currentData(int[] nums, int index){
		 return nums[index];

	}
	public static int prevData(int[] nums, int index){
		 return nums[index-1];

	}
	public static int nextData(int[] nums, int index){
		 return nums[index+1];

	}

}
