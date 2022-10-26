
public class Author {
	String name;
	Book book;
	
	public Author(String name) {
		super();
		this.name = name;
	}

	public void print() {
		System.out.println("Author: " + name);
	}
}
