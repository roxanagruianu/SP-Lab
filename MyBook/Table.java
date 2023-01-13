
public class Table implements Element, Visitee, BookSaveVisitee{
	String title;

	public Table(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println("Table with Title: "+ title);	
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void accept(Visitor visitor) {
		visitor.visitTable(this);
	}

	@Override
	public void save(BookSaveVisitor bookSaveVisitor) {
		bookSaveVisitor.saveTable(this);
	}
}
