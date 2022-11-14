package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain naruto = new Humain("Naruto","jus de Ramen",5);
		naruto.direBonjour();
		naruto.acheter("boisson", 2);
		naruto.boire();
		naruto.acheter("ramen",10);
		
		System.out.println();
		
		Commercant marco = new Commercant("Marco","thé",5);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println();
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir","whisky",5,"Le clan des ombres",0);
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
	}

}
