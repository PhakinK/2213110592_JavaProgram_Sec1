import java.util.Scanner;

public class TestPiggyBank {

	private static Scanner scanner = new Scanner(System.in);
	private static PiggyBank pb = new PiggyBank();
	
	public static void main(String[] args) {
		inputSize();
		inputCoin();
	}
	
	public static void inputCoin() {
		
		loop: while (true) {
			System.out.println("\n=====================");
			System.out.println("Menu of PiggyBank");
			System.out.println("=====================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("=====================");
			System.out.print("Please select choice[1-5]: ");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					System.out.print("Insert amount of 1 coin: ");
					pb.addOne(scanner.nextInt());
					System.out.println("Money Total: " + pb.getTotal());
					break;
				case 2:
					System.out.print("Insert amount of 2 coin: ");
					pb.addTwo(scanner.nextInt());
					System.out.println("Money Total: " + pb.getTotal());
					break;
				case 3:
					System.out.print("Insert amount of 5 coin: ");
					pb.addFive(scanner.nextInt());
					System.out.println("Money Total: " + pb.getTotal());
					break;
				case 4:
					System.out.print("Insert amount of 10 coin: ");
					pb.addTen(scanner.nextInt());
					System.out.println("Money Total: " + pb.getTotal());
					break;
				case 5:
					break loop;
				default:
					break loop;
				
			}
		}
			
	}
	
	public static void inputSize() {
		System.out.println("Money Total: " + pb.getTotal());
		System.out.print("Please define the size of piggy bank: ");
		pb.setPiggyBank(scanner.nextInt());
		System.out.println("Size of piggy bank: " + pb.getSize());
	}

	
}
