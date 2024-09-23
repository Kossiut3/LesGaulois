package personnages;
import java.util.*;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + 
				" et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > 7) {
			parler("J ai preparé une super potion de force " + forcePotion);

		}
		else {
			parler("Je n ai pas trouvé les ingredients, ma potion est seulement de force " + forcePotion);
		}
		
	}
	public void booster(Gaulois gaulois) {
		gaulois.boirePotion(forcePotion);
	}
	
	public static void main(String[] args) {
		Druide paroramix = new Druide("Paroramix", 5, 10);
		paroramix.preparerPotion();
	}
	
}
