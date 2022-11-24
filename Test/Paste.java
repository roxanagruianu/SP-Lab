
public class Paste implements FelDeMancare{

	double pret;
	String nume;
	
	public Paste(double pret, String nume) {
		super();
		this.pret = pret;
		this.nume = nume;
	}

	@Override
	public void print() {
		System.out.println("Paste: "+ nume + "la pretul de: "+ pret);
	}

	@Override
	public void accept(Visitor visitee) {
		visitee.visitPaste(this);
	}

	public double getPret() {
		return pret;
	}
	
}
