import java.util.Scanner;

public class Example_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputText = "";
		String wordToDisplay = "";
		while(true) {
			System.out.println("Enter word: ");
			inputText = scan.nextLine();
			if (inputText.equalsIgnoreCase("stop"))
				break;
			wordToDisplay = wordToDisplay + inputText+" ";
		}
		
		System.out.println(wordToDisplay.toUpperCase());
	}
}
