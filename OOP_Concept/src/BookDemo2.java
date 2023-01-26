import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		
		String authorName = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		
		String bookTitle = JOptionPane.showInputDialog("Input book title:");
		int bookPages = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int confirm = JOptionPane.showConfirmDialog(null, "Is the page correct?" , "Confirm" , 0);
		
		
		while (confirm == 1) {
			bookPages = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
			confirm = JOptionPane.showConfirmDialog(null, "Is the page correct?" , "Confirm" , 0);
		}
			
		BookNew book = new BookNew(bookTitle, new Author(authorName , email), bookPages);
		
		JOptionPane.showMessageDialog(null, "Book Title: " + book.getTitle() +
				"\nAuthor name: " + book.getAuthor().getName() + " (" + book.getPage() + ")" +
				"\nAuthor e-mail: " + book.getAuthor().getEmail());
		
	}
}
