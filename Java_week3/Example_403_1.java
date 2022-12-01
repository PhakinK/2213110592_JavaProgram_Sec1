import javax.swing.JOptionPane;

public class Example_403_1 {

	public static void main(String[] args) {
		
		String sentence = JOptionPane.showInputDialog("Input a sentence");
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = JOptionPane.showInputDialog("Input a sentence, again");
		}
		
		int countSpace = 0;
		
		for (char spacebar : sentence.toCharArray()) {
			if (spacebar == ' ')
				countSpace++;
		}
		
		JOptionPane.showMessageDialog(null ,  "This sentence has " + countSpace + " spaces. "
				+ "\n" + "This sentence has " + (countSpace + 1) + " words.");
	}
	
}
