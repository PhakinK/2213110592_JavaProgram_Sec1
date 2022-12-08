import java.util.Scanner;

public class Lab504 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Plesae enter your name, Seperate by a space. \n :");
		String fullName = scanner.nextLine();
		
		System.out.println(abbreviatName(fullName) + fullName.substring(0 , 1).toUpperCase() + fullName.substring(1, fullName.indexOf(" ")));
	}
	
	/*
	private static String abbreviatName(String fullName) {
		String[] space = fullName.split(" ");
		
		return space[space.length - 2].toUpperCase().charAt(0) + "." + space[space.length - 1].toUpperCase().charAt(0);
	} */

	
	private static String abbreviatName(String fullName) {
		String newName = "";
		
		for (int i = 0; i < fullName.length(); i++) {
			if (fullName.charAt(i) == ' ') {
				newName = (newName + fullName.charAt(i+1)).toUpperCase();
				newName = newName + ".";
			}
		}
		
		return newName;
	}
}
