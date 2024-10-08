package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " << " + texte + ">>");
	}

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoi un grand coup dans la m�choire de " + romain.getNom() );
		romain.recevoirCoup((force / 3) * effetPotion);
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Duide, je sens que ma force est "+ forcePotion + " fois d�cupl�e");
	}
	
	
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("asterix", 8);
		Romain cesar = new Romain("cesar",10);
		Druide paroramix = new Druide("Paroramix", 5, 10);
		paroramix.preparerPotion();
		
		asterix.parler("Le vent se leve, il faut tenter de vivre");
		asterix.boirePotion(paroramix.getforcePotion());
		asterix.frapper(cesar);
		
		
	}

}
