import javax.swing.JOptionPane;

public class Example1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input full name: ");
		int birthYears = Integer.parseInt(JOptionPane.showInputDialog("Input birth years: "));
		while(birthYears < 1990 || birthYears > 2018) {
			birthYears = Integer.parseInt(JOptionPane.showInputDialog("Input birth years: "));
		}
		int gender = JOptionPane.showConfirmDialog(null,
				"Are you female?",
				"Gender",
				JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showMessageDialog(null,
				"Full name: " + name +
				"\nBirth years: " + birthYears +
				"\nYou're " + (gender==0?"Female":"Male"));
	}

}
