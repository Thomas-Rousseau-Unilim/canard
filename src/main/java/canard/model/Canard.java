package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {
	
	protected final String nom;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	protected Canard(String nom,ComportementVol comportementVol,ComportementCancan comportmentCancan) {
		this.nom = nom;
		this.comportementVol = comportementVol;
		this.comportementCancan = comportmentCancan;
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
	

	public void changerComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}


	public void changerComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}

	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}
}
