package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
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

}
