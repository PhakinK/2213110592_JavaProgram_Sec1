package practice1;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in); // input data from keyboard
		String choice;
		System.out.print("Insert or Read data(from File)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = console.next().toLowerCase();			
		}
		SaveAndOpen file = new SaveAndOpen(); //call SaveandOpen() class
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			choice = console.next();
			file.setDept(choice); //call setDept() method from Employee() class
			file.read(); //call read() method from SaveandOpen() class
		}
	}
}
