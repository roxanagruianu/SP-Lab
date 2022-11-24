
public class Pizza implements FelDeMancare{
	
	double pret;
	String nume;
	
	public Pizza(double pret, String nume) {
		super();
		this.pret = pret;
		this.nume = nume;
	}

	@Override
	public void print() {
		System.out.println("Pizza: "+ nume + ", la pretul de "+ pret);
	}

	@Override
	public void accept(Visitor visitee) {
		visitee.visitPizza(this);
	}

	public double getPret() {
		return pret;
	}

}
