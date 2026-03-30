package canard.application;

import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {

	public static void main(String[] args) {
		Colvert colvert = new Colvert("Eric");
		PrototypeCanard prototype = new PrototypeCanard("Erica");
		
		System.out.println(colvert.nager());
		System.out.println(colvert.effectuerCancan());
		System.out.println(colvert.effectuerUnVol());
		System.out.println(prototype.afficher());
		System.out.println(prototype.effectuerUnVol());
		
		prototype.changerComportementVol(new PropulsionAReaction());
		
		System.out.println(prototype.effectuerUnVol());
	
	
	
	
	
	}

}
