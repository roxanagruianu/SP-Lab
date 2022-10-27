import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
	String title;
	List<Author> authors = new ArrayList<>();
	List<Element> content = new ArrayList<>();
		
	public Book(String title) {
		super(title);
		this.title = title;
	}
	
	public void print() {
		System.out.println("Book: " + title);
		System.out.println();
		System.out.println("Authors: ");
		authors.forEach((a) ->{
			a.print();
		});
		System.out.println();
		content.forEach((c) -> {
			c.print();
		});
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
	
	public void addContent(Element e) {
		content.add(e);
	}
}
