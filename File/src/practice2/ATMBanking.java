package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("ATMBookBank.txt"));
		
		String temp = "";
		
		String id = null,pass = null;
		int money = 0;
		
		while((temp = reader.readLine()) != null ) {
			String[] data = temp.split("\t");
			System.out.print("Enter account number\t: ");
			id = scan.next();
			
			while (!id.equals(data[0])) {
				System.out.print("Input wrong type, Enter account number\t: ");
				id = scan.next();
			}
			
			System.out.print("Enter password\t: ");
			pass = scan.next();
			
			while (!pass.equals(data[1])) {
				System.out.print("Enter password\t: ");
				pass = scan.next();
			}
			
			System.out.print("Enter money\t: ");
			money = scan.nextInt();
			
			while(money < 0) {
				System.out.print("Enter money\t: ");
				money = scan.nextInt();
			}
			
			break;
		}
		
		ATMChecking checker = new ATMChecking(id, pass, money);
		
		if (!checker.checkBookBank()) {
			System.out.println();
			System.err.println("Sorry, your id or password is wrong, or your amount not enought.");
			return;
		}
		
		System.out.println();
		checker.show();
	}
}
