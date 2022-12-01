import java.util.Scanner;

public class Lab403 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Message : ");
		
		String message = scanner.nextLine();
		String lowerMessage = message.toLowerCase();
		
		if (lowerMessage.indexOf("nichi") >= 0) {
			System.out.println("Nichi is a message");
		} else {
			System.out.println(message);
		}
	}

}
