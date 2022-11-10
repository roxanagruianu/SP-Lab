import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee{
	String title;
	List<Element> elements = new ArrayList<>();
	
	public Section(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(title);
		elements.forEach((e) -> {
			e.print();
		});
	}

	@Override
	public void add(Element e) {
		elements.add(e);	
	}

	@Override
	public void remove(Element e) {
		int index = elements.indexOf(e);
		elements.remove(index);
	}

	@Override
	public Element get(int i) {
		return elements.get(i);
	}

	public void accept(Visitor visitor) {
		elements.forEach((e) -> {
			if(e instanceof Image) {
				visitor.visitImage(null);
			}
			else if(e instanceof ImageProxy) {
				visitor.visitImageProxy(null);
			}
			else if(e instanceof Table) {
				visitor.visitTable(null);
			}
			else if(e instanceof Paragraph) {
				visitor.visitParagraph(null);
			}
		});
	}
	
}
