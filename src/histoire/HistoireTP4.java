package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain naruto = new Humain("Naruto","jus de Ramen",5);
		naruto.direBonjour();
		naruto.acheter("boisson", 2);
		naruto.boire();
		naruto.acheter("ramen",10);
		System.out.println(naruto.getArgent());
		
	}

}
