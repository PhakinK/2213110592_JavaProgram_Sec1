import java.util.Scanner;

public class BookDemoNew {

	
	public static void main(String[] args) {
		Author author = new Author();
		BookNew book = new BookNew();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name: ");
		author.setName(scan.nextLine());
		System.out.print("Input author email: ");
		author.setEmail(scan.nextLine());
		
		System.out.println();
		
		book.setAuthor(author);
		System.out.print("Input book title: ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book page: ");
		book.setPage(scan.nextInt());
		
		System.out.println("\n" + book);
	}
}
