package practice2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ATMChecking extends ATMData {
	
	private int money;
	
	private static BufferedReader reader;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
		
		try {
			reader = new BufferedReader(new FileReader("ATMBookBank.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean checkBookBank() throws IOException {

		
		String temp = "";
		
		while((temp = reader.readLine()) != null ) {
			String[] data = temp.split("\t");
			
			if (data[0].equals(getID()) && data[1].equals(getPass())) {
				
				if (money > Integer.parseInt(data[2]))
					return false;
				else
					return true;
				
			}
			
		}
		
		return false;
	}
	
	public void show() throws NumberFormatException, IOException {
		
		double currentBalance = 0;
		
		String temp = "";
		
		while((temp = reader.readLine()) != null ) {
			String[] data = temp.split("\t");
			if (checkBookBank())
				currentBalance = Double.parseDouble(data[2]);
			
			break;
		}
		
		System.out.println("You drawing for " + money + ", get"
				+ "\n\t\t1000 = " + (money / 1000)
				+ "\n\t\t500  = " + (money / 500) 
				+ "\n\t\t100  = " + (money % 1000) * 100
				); 
		System.out.println("Your balance is " + (money - currentBalance));
	}
}
