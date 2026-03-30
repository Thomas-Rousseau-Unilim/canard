package canard.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import canard.model.cancan.CanardMuet;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler !";

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerUnVol();
		assertEquals(VOLER, texteVolColvert);

		// on peut inliner les assert
		// car ici le code de test est simple à lire
		assertEquals(VOLER, mandarin.effectuerUnVol());

		assertEquals(NE_PAS_VOLER, leurre.effectuerUnVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerUnVol());
	}

	@Test
	public void test_effectuerCancan() {

		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());

		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {

		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());

		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
	}
	
	@Test
	public void test_changer_comportement_vol() {
		colvert.changerComportementVol(new NePasVoler());
		assertEquals(NE_PAS_VOLER,colvert.effectuerUnVol());
	}
	
	@Test
	public void test_changer_comportement_cancan() {
		colvert.changerComportementCancan(new CanardMuet());
		assertEquals(SILENCE,colvert.effectuerCancan());
	}
	
	
}