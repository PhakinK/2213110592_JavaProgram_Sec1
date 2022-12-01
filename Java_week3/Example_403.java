import java.util.Scanner;

public class Example_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		
		int countSpace = 0;
		
		for (char spacebar : sentence.toCharArray()) {
			if (spacebar == ' ')
				countSpace++;
		}
		
		System.out.println("This sentence has " + countSpace + " space.");
		System.out.println("This sentence has " + (countSpace - 1) + "");
	}
}
