
public class Paragraph extends Element {
	String text;

	public Paragraph(String text) {
		super();
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println("Paragraph: " + text);		
	}
	
}
