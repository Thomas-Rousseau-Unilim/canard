package canard.model;

public abstract class Canard {
	
	protected final String nom;
	
	protected Canard(String nom) {
		this.nom = nom;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres!";
	}
	
	public abstract String afficher();

	public String getNom() {
		return nom;
	}
	
}
