import java.util.ArrayList;
import java.util.List;

public class Comanda implements FelDeMancare{

	String nume;
	List<FelDeMancare> mancare = new ArrayList<>();
	List<SubComanda> subcomenzi = new ArrayList<>();
	
	@Override
	public void print() {
		System.out.println("Comanda: "+ nume);
		mancare.forEach((m) ->{
			m.print();
		});
		subcomenzi.forEach((s) ->{
			s.print();
		});
	}

	@Override
	public void accept(Visitor visitee) {
		mancare.forEach((m) ->{
			m.accept(visitee);
		});
		subcomenzi.forEach((s) ->{
			s.accept(visitee);
		});
	}

}
