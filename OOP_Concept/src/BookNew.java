public class BookNew {

	
	private String title;
	private Author author;
	private int page;
	
	public BookNew(String title, Author author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public BookNew(String title, Author author) {
		this(title,author,0);
	}
	
	public BookNew() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return title + " has " + page + " pages writes by " + author;
	}
	
}
