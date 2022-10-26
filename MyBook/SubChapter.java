import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	String name;
	List<Element> elements = new ArrayList<>();
	
	public SubChapter(String name) {
		super();
		this.name = name;
	}
	
	public void createNewParagraph(String text) {
		Paragraph p = new Paragraph(text);
		elements.add(p);
	}
	
	public void createNewImage(String name) {
		Image i = new Image(name);
		elements.add(i);
	}
	
	public void createNewTable(String title) {
		Table t = new Table(title);
		elements.add(t);
	}
	
	public void print() {
		System.out.println("Subchapter: " + name);
		elements.forEach((e) ->{
			e.print();
		});
	}
}
