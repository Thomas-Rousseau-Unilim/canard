package canard.model;

import canard.model.vol.NePasVoler;

public class Leurre extends Canard{
	
	public Leurre(String nom) {
		super(nom,new NePasVoler());
	}
	
	public String afficher() {
		return "Je suis un Leurre";
	}
}
