
public class Author {
	String name;
	String surname;

	public Author(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public void print() {
		System.out.println("Author: " + name + surname);
	}
}
