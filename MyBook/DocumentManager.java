
public class DocumentManager {
	private Book book;
	private static DocumentManager instance = null;
	
	private DocumentManager() {}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public static DocumentManager getInstance() {
		if(instance == null) {
			instance = new DocumentManager();
		}
		return instance;
	}
}
