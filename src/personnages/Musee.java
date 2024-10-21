package personnages;

public class Musee {

	private Trophee[] trophee = new Trophee[200];
	private int nbTrophee;
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		Trophee donnation = new Trophee(gaulois, equipement);
		trophee[nbTrophee] = donnation;
		nbTrophee = nbTrophee + 1;
		
	}
	public void extraireInstructionOcaml() {
		
	}
}
