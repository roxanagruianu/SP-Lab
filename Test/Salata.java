
public class Salata implements FelDeMancare{

	double pret;
	String nume;
	
	public Salata(double pret, String nume) {
		super();
		this.pret = pret;
		this.nume = nume;
	}

	@Override
	public void print() {
		System.out.println("Salata: "+ nume + "la pretul de: "+ pret);
	}

	@Override
	public void accept(Visitor visitee) {
		visitee.visitSalata(this);
	}

	public double getPret() {
		return pret;
	}

}
