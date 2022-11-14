package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom,boissonFav,argent);
	}

	public int seFaireExtorquer() {
		int vol = argent;
		argent = 0 ;
		parler(" J’ai tout perdu! Le monde est trop injuste...");
		return vol;
	}
	public void recevoir(int don) {
		gagnerArgent(don);
		parler(don+" sous ! Je te remercie généreux donateur!");
	}
}