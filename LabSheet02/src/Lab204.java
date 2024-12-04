import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
	        int xValue, yValue;
	        System.out.print("Input value of X: ");
	        xValue = input.nextInt();
	        System.out.print("Input value of Y: ");
	        yValue = input.nextInt();
	        while (yValue <= xValue) {
	         System.out.print("Input value of Y, again : ");
	            yValue = input.nextInt();
	        }
	        System.out.println();
	        int sum = xValue;
	        for(int i = xValue+1;i<=yValue;i++) {
	        	System.out.print(sum + " + " + i + " = " + (sum+i));
	        	System.out.println();
	        	sum+=i;
	        }
	       
	        input.close();
	}

}
