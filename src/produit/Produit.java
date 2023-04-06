package produit;

import personnages.Gaulois;

public abstract class Produit implements IProduit {
	String nom;
	String unite;
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public abstract String description();
	
	public abstract int calculerPrix(int prix);
}
