package personnages;
import java.util.*;
public class Druide {
	private static final int FORCE_MOYENNE = 7;
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	Random random = new Random();
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + 
				" et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getforcePotion(){
		return forcePotion;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > FORCE_MOYENNE) {
			parler("J ai prepar� une super potion de force " + forcePotion);

		}
		else {
			parler("Je n ai pas trouv� les ingredients, ma potion est seulement de force " + forcePotion);
		}
		
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else {
		gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide paroramix = new Druide("Paroramix", 5, 10);
		paroramix.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 7);
		paroramix.booster(obelix);
		
		
	}
	
}
