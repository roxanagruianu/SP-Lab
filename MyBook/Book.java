import java.util.ArrayList;
import java.util.List;

public class Book {
	String title;
	List<Author> authors = new ArrayList<>();
	List<Chapter> chapters = new ArrayList<>();
		
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public int createChapter(String name) {
		Chapter c = new Chapter(name);
		chapters.add(c);
		return chapters.indexOf(c);
	}
	
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}

	public void print() {
		System.out.println("Book: " + title);
		System.out.println("Authors: ");
		authors.forEach((a) ->{
			a.print();
		});
		chapters.forEach((c) ->{
			c.print();
		});
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
}
