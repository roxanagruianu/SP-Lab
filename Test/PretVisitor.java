
public class PretVisitor implements Visitor{

	double pretPizza = 0;
	double pretPaste = 0;
	double pretSalata = 0;
	
	@Override
	public void visitPizza(Pizza p) {
		pretPizza += p.getPret();
	}

	@Override
	public void visitPaste(Paste pa) {
		pretPaste += pa.getPret();
	}

	@Override
	public void visitSalata(Salata s) {
		pretSalata += s.getPret();
	}
	
	public void pretTotalFel() {
		System.out.println("Pret pizza: " + pretPizza);
        System.out.println("Pret paste: " + pretPaste);
        System.out.println("Pret salata: " + pretSalata);
	}
	
	public void pretTotalComanda() {
		double pret = pretPizza + pretPaste + pretSalata;
		System.out.println("Pret total comanda: " + pret);
	}
}
