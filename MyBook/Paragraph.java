
public class Paragraph implements Element {
	String text;

	public Paragraph(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println("Paragraph: " + text);		
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
	
}
