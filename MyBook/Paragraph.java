public class Paragraph implements Element, Visitee, BookSaveVisitee {
	String text;
	AlignStrategy textAlignment = null;

	public Paragraph(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		if(textAlignment == null) {
			System.out.println("Paragraph: "+ text);
		}
		else {
			textAlignment.render(this, text);
		}
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
	
	public void setAlignStrategy(AlignStrategy a) {
		this.textAlignment = a;
	}

	public void accept(Visitor visitor) {
		visitor.visitParagraph(this);
	}

	@Override
	public void save(BookSaveVisitor bookSaveVisitor) {
		bookSaveVisitor.saveParagraph(this);
	}
	
}
