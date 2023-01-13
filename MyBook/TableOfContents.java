import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element, Visitee, BookSaveVisitee{
	
	List<Element> tocontent = new ArrayList<>();
	List<Integer> pages = new ArrayList<>();
	
	@Override
	public void print() {
		System.out.println("Table of contents: ");
		for(int i=0; i<tocontent.size();i++) {
			System.out.println(tocontent.get(i) + " .... " + pages.get(i));
		}
	}
	
	public void add(Element e, int pag) {
		tocontent.add(e);
		pages.add(pag);
	}

	@Override
	public void remove(Element e) {
		
	}

	@Override
	public Element get(int i) {
		return null;
	}

	public void accept(Visitor visitor) {
		visitor.visitTableOfContents(this);
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(BookSaveVisitor bookSaveVisitor) {
		bookSaveVisitor.saveTableOfContents(this);
	}
	
}
