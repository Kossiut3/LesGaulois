package personnages;

public class Romain {
	private String nom;
	private int force;
	//private Equipement[] equipements = Equipement[2];
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantSatisfied();
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler (String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";  
	}
	
	private boolean isInvariantSatisfied() {
		return force >= 0;
	}
	
	public void recevoirCoup(int forceCoup) {
		int var_loc = force;
		force -= forceCoup;
		assert isInvariantSatisfied();
		if (force > 0) {
			parler("Aîe");
		} else {
			parler("J'abandonne...");
		}
		assert forceCoup < var_loc;
	}
	
	
	public static void main(String[] args) {
		
		Romain minus = new Romain("minus", 6);
		minus.parler("On va conquerir l amazonie !!");
		minus.recevoirCoup(2);
		
		
		
	}
	

}
