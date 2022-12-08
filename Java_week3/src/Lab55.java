import java.util.Scanner;

public class Lab55 {

	public static void main(String[] args) {
		
		inputStudent();
	}
	
	private static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Id: ");
		String id = scanner.nextLine();
		System.out.println("Enter Subject Id: ");
		String subject = scanner.nextLine();
		
		while (isLength(id,subject)) {
			
			System.out.println("Enter Student Id: ");
			id = scanner.nextLine();
			System.out.println("Enter Subject Id: ");
			subject = scanner.nextLine();
		}
		
		
	}
	
	private static boolean isLength(String studentId, String studentSubject) {
		return studentId.length() == 10 && studentSubject.length() == 7;
	}

	private static boolean isITStudent() {
		return false;
	}
	
	private static boolean isITSubject() {
		return false;
	}
	
	private static void displayData() {
		
	}
}
