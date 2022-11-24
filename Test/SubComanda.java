import java.util.ArrayList;
import java.util.List;

public class SubComanda implements FelDeMancare{

	String nume;
	List<FelDeMancare> mancare = new ArrayList<>();
	
	public SubComanda(String nume) {
		super();
		this.nume = nume;
	}
	
	public void addFelDeMancare(FelDeMancare f) {
		mancare.add(f);
	}

	@Override
	public void print() {
		System.out.println("Sub-comanda: "+ nume);
		mancare.forEach((m) ->{
			m.print();
		});
	}

	@Override
	public void accept(Visitor visitee) {
		mancare.forEach((m) ->{
			m.accept(visitee);
		});
	}	
	
	public void addFel(FelDeMancare f) {
		mancare.add(f);
	}
	
}
