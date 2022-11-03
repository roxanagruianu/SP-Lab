
public class AlignRight implements AlignStrategy{

	@Override
	public void render(Paragraph p, String Context) {
		System.out.println("Paragraph: ##" + p.text);
	}

}
