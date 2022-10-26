
public class Image extends Element{
	String imageName;
	
	public Image(String imageName) {
		super();
		this.imageName = imageName;
	}

	@Override
	public void print() {
		System.out.println("Image with name: " + imageName);
	}
	
}
