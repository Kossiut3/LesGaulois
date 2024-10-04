package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
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
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert forceCoup < var_loc;
	}
	
	public void sEquiper(Equipement equipement) {
		
		switch (nbEquipement) {
		case 2: {
			System.out.println("le soldat " + getNom() + " est deja bien protege !");
			break;	
		}
		case 1:{
			if (equipements[0].equals(equipement)) {
				System.out.println("le soldat " + getNom() + " possede deja un " + equipement);
			}
			else {
				extracted(equipement);
			}
			break;
		}
		
		default:
			extracted(equipement);
			break;
		}
	}

	private void extracted(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement += 1;
		System.out.println("le soldat " + getNom() + " s equipe avec un " + equipement);
	}
	
	
	
	public static void main(String[] args) {
		
		Romain minus = new Romain("minus", 6);
		minus.parler("On va conquerir l amazonie !!");
		minus.recevoirCoup(2);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
		
		
		
	}
	

}
