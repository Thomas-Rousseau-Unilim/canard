package canard.model;

import canard.model.vol.ComportementVol;

public abstract class Canard {
	
	protected final String nom;
	protected final ComportementVol comportementVol;
	
	protected Canard(String nom,ComportementVol comportementVol) {
		this.nom = nom;
		this.comportementVol = comportementVol;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres!";
	}
	
	public abstract String afficher();

	public String getNom() {
		return nom;
	}
	
	public String effectuerUnVol() {
		return comportementVol.voler();
	}
}
