package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

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
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir","whisky",5,"Clan des ombres",0);
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		System.out.println();
		Ronin roro = new Ronin("Roro","shochu",60,1);
		roro.direBonjour();
		roro.donner(marco);
		System.out.println();
		roro.provoquer(yakuLeNoir);
		
		System.out.println();
		Yakuza denjiro = new Yakuza("Denjiro","saké",10,"Clan de la Triade des enfers",15);
		roro.provoquer(denjiro);
	}

}
