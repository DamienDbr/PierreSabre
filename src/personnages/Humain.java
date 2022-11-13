package personnages;

public class Humain {
	
	private String nom;
	private String boissonFav;
	protected int argent;
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}
	private String prendreParole() {
		return "(" + nom + ") - ";
	} 
	public void parler(String texte) {
		System.out.println(prendreParole() + texte );
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+boissonFav);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFav+" ! GLOUPS !");
	}
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	public void acheter(String bien, int prix) {
		if(bien=="boisson") {
			if(argent>=prix) {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une "+bien+" à "+prix+" sous.");
				perdreArgent(prix);
			}
			else {
		
				parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
			}
		}
		else {
			if(argent>=prix) {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" à "+prix+" sous.");
				perdreArgent(prix);
			}
			else {
				parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien+" à "+prix+" sous.");
		}
		
					
		}
	}

}