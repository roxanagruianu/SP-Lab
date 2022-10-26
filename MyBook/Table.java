
public class Table extends Element{
	String title;

	public Table(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println("Table with Title: "+ title);	
	}
}
