package scenarioTest;

import personnages.Gaulois;
import produit.*;
import villagegaulois.*;

public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
			
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalS2 = new Etal<>();;
		etalS2.installerVendeur(obelix, sangliersObelix, 8);
		Etal<Sanglier> etalS1 = new Etal<>();
		etalS1.installerVendeur(asterix, sangliersAsterix, 10);
		
		Etal<Poisson> etalP = new Etal<>();
		etalP.installerVendeur(ordralfabetix, poissons, 7);
		
		IEtal[] marche;
		
	}
	
}
