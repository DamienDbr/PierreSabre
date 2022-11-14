package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	public Yakuza(String nom, String boissonFav, int argent,String clan,int reputation) {
		super(nom,boissonFav,argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		argent += argentVictime;
		parler("J’ai piqué les "+argentVictime+" sous de "+victime.getNom()+", ce qui me fait "+argent+ " sous dans ma poche. Hi ! Hi !");
		reputation+=1;
		
	}
	public int getReputation() {
		return reputation;
	}
	public String getClan() {
		return clan;
	}
	public void perdre() {
		parler("J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le "+getClan());
		argent =0;
		reputation -=1;			
	}
	public void gagner(int perte) {
		int argentGagne = perte;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du "+getClan()+" ? Je lai dépouillé de ses "+argentGagne+" sous.");		
		argent += argentGagne;
		reputation +=1;
		
	}

}
