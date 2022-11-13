package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}

	public int seFaireExtorquer() {
		int don = argent;
		argent = 0 ;
		return don;
	}
	/*void recevoir(int argent) {
		arg
	}*/
}