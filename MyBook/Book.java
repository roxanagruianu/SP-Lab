import java.util.ArrayList;
import java.util.List;

public class Book {
	String title;
	List<String> paragraphs = new ArrayList<String>();
	List<String> images = new ArrayList<String>();
	List<String> tables = new ArrayList<String>();
	List<String> contents = new ArrayList<String>();
	public Book(String title) {
		this.title = title;
	}
	public void createNewParagraph(String paragraph) {
		paragraphs.add(paragraph);
		contents.add(paragraph);
	}
	public void createNewImage(String image) {
		images.add(image);
		contents.add(image);
	}
	public void createNewTable(String table) {
		tables.add(table);
		contents.add(table);
	}
	public void print() {
		for(int i=0; i<contents.size(); i++) {
			System.out.print(contents.get(i)+" ");
		}
	}
}
