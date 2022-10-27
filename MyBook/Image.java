
public class Image implements Element{
	String url;
	
	public Image(String imageName) {
		super();
		this.url = imageName;
	}

	@Override
	public void print() {
		System.out.println("Image with name: " + url);
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
