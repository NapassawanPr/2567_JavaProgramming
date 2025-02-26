import java.io.*;

public class ATMChecking extends ATMData {
	private int money;
	private int balance;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
}

	public boolean checkBookBank() {
		try (BufferedReader reader = new BufferedReader(new FileReader("src//txtFile//ATMBookBank.txt"))) { 
			String temp="";
			while ((temp = reader.readLine()) != null) {
				String[] data = temp.split("\t");

				if (data.length == 3 && data[0].equals(getID()) && data[1].equals(getPass())) {
					balance = Integer.parseInt(data[2]);
					return balance >= money;
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public void show() {
		if (checkBookBank()) {
			balance -= money;
			System.out.println("You drawing for " + String.format("%,.2f", (double) money) + ", get");

			int thousand = money / 1000;
			money %= 1000;
			int fiveHundred = money / 500;
			money %= 500;
			int hundred = money / 100;

			System.out.println("\t1000 = " + thousand);
			System.out.println("\t500 = " + fiveHundred);
			System.out.println("\t100 = " + hundred);
			System.out.println("\nYour balance is " + String.format("%,.2f", (double) balance) + " Baht.");
		} else {
			System.out.println("Sorry, your id or password is wrong, or your amount not enough.");
		}
	}
}


