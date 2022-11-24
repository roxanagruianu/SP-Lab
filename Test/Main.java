
public class Main {
	public static void main(String[] args) {

        Comanda exemplu_comanda = new Comanda("Comanda");

        SubComanda kfc = new SubComanda("KFC");
        SubComanda belvedere = new SubComanda("Belvedere");

        Pizza quatroFormaggi = new Pizza(15, "Quatro Formaggi");
        Paste carbonara = new Paste(17, "Carbonara");
        Salata colesaw = new Salata(8, "Colesaw");
        Pizza quatroStagioni = new Pizza(12, "Quatro Stagioni");

        kfc.addFel(quatroFormaggi);
        kfc.addFel(carbonara);

        belvedere.addFel(quatroStagioni);
        belvedere.addFel(colesaw);

        exemplu_comanda.addSubComanda(kfc);
        exemplu_comanda.addSubComanda(belvedere);

        exemplu_comanda.print();

        System.out.println();

        PretVisitor visitor = new PretVisitor();
        exemplu_comanda.accept(visitor);
        visitor.pretTotalFel();
        System.out.println();
        visitor.pretTotalComanda();
    }
}
