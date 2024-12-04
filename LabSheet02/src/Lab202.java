import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   int numberAfter,previousNumber;
		   System.out.print("Input number : ");
		   previousNumber = input.nextInt();

		   while(true) {
		      System.out.print("Input number : ");
		      numberAfter = input.nextInt();
		      if (numberAfter < previousNumber) {
		         break; 
		     }
		      previousNumber = numberAfter;
		   }
		   System.out.println("\nBYE BYE");
		   input.close();

	}

}
