
import java.util.*;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter account number : ");
		String accountNumber = scanner.nextLine();
		
		while(accountNumber.length()!=13 && accountNumber.charAt(1)!='-' &&  )

		System.out.print("Enter password : ");
		String password = scanner.next();

		while (password.length()!=4) {
			System.out.print("Enter password : ");
			password = scanner.next();
		}

		System.out.print("Enter money : ");
		int money = scanner.nextInt();

		while (money <= 0 || money % 100 != 0) {
			System.out.print("Enter money : ");
			money = scanner.nextInt();
		}

		ATMChecking bank = new ATMChecking(accountNumber, password, money);
		System.out.println();
		bank.show();

	
	}
}