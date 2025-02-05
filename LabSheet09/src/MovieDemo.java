import java.util.*;
public class MovieDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input movie id   : ");
		String movieId = input.nextLine();
		System.out.print("Input movie name : ");
		String movieName = input.nextLine();
		System.out.println();

		System.out.print("Input director name   : ");
		String directorName = input.nextLine();
		System.out.print("Input director email  : ");
		String directorEmail = input.nextLine();

		System.out.print("Input director gender : ");
		char gender = input.next().charAt(0);
		while (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.print("Input director gender, again : ");
			gender = input.next().charAt(0);
		}
		
		System.out.println();
		Director director = new Director(directorName, directorEmail, gender);
		
		System.out.print("Input movie theater no. : ");
		int theaterNo = input.nextInt();
		while (theaterNo < 1 || theaterNo > 15) {
			System.out.print("Please input 1-15 only  : ");
			theaterNo = input.nextInt();
		}
		
		Theater theater = new Theater(movieId, movieName, director, theaterNo);
		System.out.println();
		System.out.println(theater);
		
		input.close();
	}
}

