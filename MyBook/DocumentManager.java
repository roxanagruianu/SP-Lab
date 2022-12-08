
public class DocumentManager {
	private Book book;
	private static DocumentManager instance = new DocumentManager();
	
	private DocumentManager() {}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public static DocumentManager getInstance() {
		return instance;
	}
}
