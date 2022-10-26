import java.util.ArrayList;
import java.util.List;

public class Chapter {
	String name;
	List<SubChapter> subchapters = new ArrayList<>();
	
	public Chapter(String name) {
		super();
		this.name = name;
	}
	
	public void print() {
		System.out.println("Chapter: " + name);
		subchapters.forEach((s) ->{
			s.print();
		});
	}
	
	public int createSubChapter(String name) {
		SubChapter s = new SubChapter(name);
		subchapters.add(s);
		return subchapters.indexOf(s);
	}
	
	public SubChapter getSubChapter(int index) {
		return subchapters.get(index);
	}
}
