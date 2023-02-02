import javax.swing.JOptionPane;

public class TestInformation {

	public static void main(String[] args) {
		
		String author = JOptionPane.showInputDialog("Input author name");
		String eMail = JOptionPane.showInputDialog("Input author e-mail");
		String bookTitle = JOptionPane.showInputDialog("Input book title");
		
		
		int eMailConfirmation = JOptionPane.showConfirmDialog(null, "Do you confirm your e-mail?" , "Confirm" , 0);
		
		if (eMailConfirmation == 1) {
			
			eMail = JOptionPane.showInputDialog("Input author e-mail");
		}
		
		BookNew book = new BookNew(bookTitle , new Author(author,eMail) , 0);
		
		JOptionPane.showMessageDialog(null, 
				"Book Title:" + book.getTitle() +
				"\nAuthor name:" + book.getAuthor().getName() +
				"\nAuthor e-mail:" + book.getAuthor().getEmail()
		);
		
		
	}
}
