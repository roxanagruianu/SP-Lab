import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
	String url;
	String content;
	
	public Image(String url) {
		super();
		this.url = url;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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

	@Override
	public String url() {
		return url;
	}

	@Override
	public int dim() {
		return 0;
	}

	@Override
	public String content() {
		return content;
	}
	
}
