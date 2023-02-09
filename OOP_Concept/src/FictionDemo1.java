import javax.swing.JOptionPane;

public class FictionDemo1 {
	
	public static void main(String[] args) {
		
		String title = JOptionPane.showInputDialog("Input title:");
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		
		String name = JOptionPane.showInputDialog("Input name:");
	
		FictionBook fictionBook = new FictionBook(title , year);
			
		fictionBook.setAuthorName(name);
		
		while (fictionBook.checkFormatName()) {
			
			name = JOptionPane.showInputDialog("Input name, again:");
			
			fictionBook.setAuthorName(name);
		}
		
		String email = JOptionPane.showInputDialog("Input eMail:");
		
		fictionBook.setEmail(email);
		
		while (!fictionBook.checkEmail()) {
			
			email = JOptionPane.showInputDialog("Input eMail, again:");
			
			fictionBook.setEmail(email);
		}
		
		JOptionPane.showMessageDialog(null, fictionBook);
	}

}
