package produit;

public class Poisson extends Produit {
	String date;
	
	public Poisson(String date) {
		this.nom = "poisson";
		this.date = date;
		
	}
	
	public String description(){
		return "poisson pêchés "+ date;
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}
}