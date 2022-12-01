import java.util.Scanner;

public class Lab402 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scanner.nextLine();
		
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scanner.nextLine();
		}

		System.out.println();
		
		int itNum = 0;
		
		String formatSentence = sentence.replace(".", " "); 
		
		
		for (int i = 0; i < formatSentence.length(); i++) {
			if (formatSentence.charAt(i) == ' ') {
				System.out.println(formatSentence.substring(itNum, i));
				itNum = i + 1;
			}
			
		}
	}

}
