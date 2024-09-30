package personnages;

public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obélix", 25);
		Romain minus = new Romain("Minus", 6);
		Druide paroramix = new Druide("Paroramix", 5, 10);
		/*asterix.parler("Bonjour à tous");
		minus.parler("UN GAU.. UN GAUGAU..");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);*/
		paroramix.parler("Je vais preparer une petite potion...");
		paroramix.preparerPotion();
		paroramix.booster(Obelix);
		Obelix.parler("Par Belenos, ce n est pas juste !");
		paroramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(minus);
		
		
		
		
		
		
		
		
	}

}
