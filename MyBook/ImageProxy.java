public class ImageProxy implements Picture, Element, Visitee{
	String url;
	Image realImage;
	
	public ImageProxy(String url) {
		super();
		this.url = url;
		this.realImage = null;
	}

	public Image loadImage() {
		if(realImage == null) {
			realImage = new Image(url);
		}
		return realImage;
	}

	@Override
	public void print() {
		loadImage().print();		
	}
	
	@Override
	public String url() {
		return url;
	}

	@Override
	public int dim() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String content() {
		// TODO Auto-generated method stub
		return null;
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
		visitor.visitImageProxy(this);
	}

}
