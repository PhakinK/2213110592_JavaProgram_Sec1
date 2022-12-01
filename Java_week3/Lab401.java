import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scanner.nextLine();
		if (!fullName.contains(" ")) {
			
			System.out.println("Incorrect Name");
			return;
		}
		int spaceIndex = fullName.indexOf(" ");
		String firstName = fullName.substring(0 , spaceIndex).toUpperCase();
		String lastName = fullName.substring(spaceIndex ,fullName.length()).toLowerCase();
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}

}
