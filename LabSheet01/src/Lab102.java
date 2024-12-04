import java.util.Scanner;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    System.out.print("Input the number of minutes: ");
	    int minutes = input.nextInt();

	    int minutesInYear = 525600;
	    int minutesInDay = 1440;
	    int year = minutes/minutesInYear;
	    int days = (minutes%minutesInYear)/minutesInDay;
	    
	    System.out.println(minutes + " minutes in approximately " + year + " years and " + days + " days");
	    input.close();
	}

}
