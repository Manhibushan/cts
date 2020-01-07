package Acc;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int choice = -1;
		Account account = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.create account.");
			System.out.println("2.Display Account");
			System.out.println("0 exit");
			System.out.println("choose your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				account = Account.createAccount(AccountType.Credit, 10000);
				break;
			case 2:
				System.out.println(account.displayAccount());
				break;
			case 0:
				System.out.println("existing from the system..");
				System.exit(0);
			default:
				System.out.print("invalid choice..");
				break;

			}

		} while (choice != 0);
	}
}
