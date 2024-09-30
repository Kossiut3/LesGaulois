package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		
		
	}
	 public void setChef(Chef chef) {
		 this.chef = chef;
	 }
	 
	 public String getNomChef() {
		 return chef.getNom();
	 }
	 
	 public void ajouterHabitant(Gaulois gaulois) {
		 villageois[nbVillageois] = gaulois;
		 nbVillageois = nbVillageois + 1;
	 }
	 
	 public Gaulois trouverHabitant(int numVillageois) {
		 return villageois[numVillageois];
	 }

	public String getNom() {
		return nom;
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans village du chef " + village.getNomChef() + " vivent les legendaires gaulois : \n");
		for(int i=0; i<nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom() + "\n");
			
		}
	}
	
	public static void main( String[] args) {
		Village villagedesIrreductible = new Village("Village des Irreductible", 30);
		Chef abaracourix = new Chef("Abaracourix", 6, villagedesIrreductible);
		villagedesIrreductible.setChef(abaracourix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		villagedesIrreductible.ajouterHabitant(obelix);
		villagedesIrreductible.afficherVillageois(villagedesIrreductible);
		
	}
	
}
