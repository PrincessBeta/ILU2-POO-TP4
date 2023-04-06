package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	int poids;
	Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		this.chasseur = chasseur;
		this.poids = poids;
		this.nom = "sanglier";
	}
	
	public String description(){
		return "sanglier de "+poids+" "+unite+ " chassé par "+ chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}