package canard.model;

import canard.model.cancan.CoinCoin;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard{

	
	
	public CanardEnPlastique(String nom) {
		super(nom, new NePasVoler(),new	CoinCoin());
	}

	public String afficher() {
		return "Je suis un canard en plastique";
	}

}
