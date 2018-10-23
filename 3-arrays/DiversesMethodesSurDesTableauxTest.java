public class DiversesMethodesSurDesTableauxTest {



	public static final void testNbOccurrences() {

		assertEquals ("cas tableau longueur 0", 0, DiversesMethodesSurDesTableaux.nbOccurrences(new int[0], 12));

		int[] tab12PasPresent = {2,3,-7,13,22,0};
		assertEquals ("cas tableau longueur > 0, val pas presente", 0, DiversesMethodesSurDesTableaux.nbOccurrences(tab12PasPresent, 12));

		// On prend bien garde de tester la prise en compte de la premiere case et de la derniere case du tableau.
		int[] tab12Present = {12,3,12,13,0,22,12};
		assertEquals ("cas tableau longueur > 0, val presente", 3, DiversesMethodesSurDesTableaux.nbOccurrences(tab12Present, 12));

	}


	public static final void testNbNegatifs() {

		assertEquals ("cas tableau longueur 0", 0, DiversesMethodesSurDesTableaux.nbNegatifs(new int[0]));

		int[] pasDeNegatifs = {2,3,7,13,22,0};
		assertEquals ("cas tableau longueur > 0, pas de negatifs", 0, DiversesMethodesSurDesTableaux.nbNegatifs(pasDeNegatifs));

		// On prend bien garde de tester la prise en compte de la premiere case et de la derniere case du tableau.
		int[] desNegatifst = {-12,3,12,-13,0,22,-12};
		assertEquals ("cas tableau longueur > 0, plusieurs negatifs", 3, DiversesMethodesSurDesTableaux.nbNegatifs
				(desNegatifst));

	}


	public static final void testSommeValeurs() {

		assertEquals ("cas tableau longueur 0", 0, DiversesMethodesSurDesTableaux.sommeValeurs(new int[0]));

		int[] tabMoyen = {12,3,12,-13,0,22};
		assertEquals ("cas moyen", 36, DiversesMethodesSurDesTableaux.sommeValeurs(tabMoyen));

	}


	public static final void testEstPresent() {

		assertFalse ("cas tableau longueur 0", DiversesMethodesSurDesTableaux.estPresent(new int[0], 12));

		int[] tab12PasPresent = {2,3,-7,13,22,0};
		assertFalse ("cas tableau longueur > 0, val pas presente", DiversesMethodesSurDesTableaux.estPresent(tab12PasPresent, 12));

		int[] tab12En1erePosition = {12,3,-7,13,0,22};
		assertTrue ("cas tableau longueur > 0, val en indice 0", DiversesMethodesSurDesTableaux.estPresent(tab12En1erePosition, 12));

		int[] tab12EnDernierePosition = {22,3,-7,13,0,12};
		assertTrue ("cas tableau longueur > 0, val en dernier indice", DiversesMethodesSurDesTableaux.estPresent(tab12EnDernierePosition, 12));

		int[] tab12EnPositionMoyenne = {22,3,-7,12,0,-12};
		assertTrue ("cas tableau longueur > 0, val en position moyenne", DiversesMethodesSurDesTableaux.estPresent(tab12EnPositionMoyenne, 12));

	}

	public static final void testTousPositifs() {

		assertTrue ("cas tableau longueur 0", DiversesMethodesSurDesTableaux.tousPositifs(new int[0]));

		int[] tabMoyenFaux = {2,0,-7,13,22,0};
		assertFalse ("cas tableau longueur > 0, faux", DiversesMethodesSurDesTableaux.tousPositifs(tabMoyenFaux));

		int[] tabMoyenVrai = {2,0,7,13,22,0};
		assertTrue ("cas tableau longueur > 0, vrai", DiversesMethodesSurDesTableaux.tousPositifs(tabMoyenVrai));

		int[] tabNegEn1erePosition = {-12,3,7,13,0,22};
		assertFalse ("cas tableau longueur > 0, negatif en indice 0", DiversesMethodesSurDesTableaux.tousPositifs(tabNegEn1erePosition));

		int[] tabNegEnDernierePosition = {22,3,7,13,0,-12};
		assertFalse ("cas tableau longueur > 0, val en dernier indice", DiversesMethodesSurDesTableaux.tousPositifs(tabNegEnDernierePosition));

	}


	public static final void testIndicePremOccurrence() {

		assertEquals("cas tableau longueur 0", -1, DiversesMethodesSurDesTableaux.indicePremOccurrence(new int[0], 12));

		int[] tab12PasPresent = {2,3,-7,13,22,0};
		assertEquals ("cas tableau longueur > 0, val pas presente", -1, DiversesMethodesSurDesTableaux.indicePremOccurrence(tab12PasPresent, 12));

		int[] tab12En1erePosition = {12,3,-7,12,0,22};
		assertEquals ("cas tableau longueur > 0, val en indice 0", 0, DiversesMethodesSurDesTableaux.indicePremOccurrence(tab12En1erePosition, 12));

		int[] tab12EnDernierePosition = {22,3,-7,13,0,12};
		assertEquals ("cas tableau longueur > 0, val en dernier indice", 5, DiversesMethodesSurDesTableaux.indicePremOccurrence(tab12EnDernierePosition, 12));

		int[] tab12EnPositionMoyenne = {22,3,-7,12,0,12, 12};
		assertEquals ("cas tableau longueur > 0, val en position moyenne", 3, DiversesMethodesSurDesTableaux.indicePremOccurrence(tab12EnPositionMoyenne, 12));

	}



	public static final void testPlusGrandPositif() {

		assertEquals ("cas tableau longueur 0", -1.0, DiversesMethodesSurDesTableaux.plusGrandPositif(new double[0]), 0.0);

		double[] queNegatifs = {-2,-3,-7.7,-13,-22.3,-7};
		assertEquals ("cas tableau longueur > 0, que des negatifs", -1.0, DiversesMethodesSurDesTableaux.plusGrandPositif(queNegatifs),0.0);

		double[] maxEnPremier = {22.4,-3.9,-7,13,-22,18.6};
		assertEquals ("cas tableau longueur > 0, que des negatifs", 22.4, DiversesMethodesSurDesTableaux.plusGrandPositif(maxEnPremier),0.0);

		double[] maxEnDernier = {12.4,-3.9,-7,13,-22,18.6};
		assertEquals ("cas tableau longueur > 0, que des negatifs", 18.6, DiversesMethodesSurDesTableaux.plusGrandPositif(maxEnDernier),0.0);

		double[] maxAuMilieuEtMax0 = {-22.4,-3.9,-7,0.0,-22,-18.6};
		assertEquals ("cas tableau longueur > 0, que des negatifs", 0.0, DiversesMethodesSurDesTableaux.plusGrandPositif(maxAuMilieuEtMax0),0.0);

	}

	/****************************************************************
	* methodes de test, NE PAS TOUCHER CE QUI SUIT
	*/

public static void main(String[] args){
	testNbOccurrences();
	testNbNegatifs();
	testSommeValeurs();
	testEstPresent();
	testPlusGrandPositif();
	testIndicePremOccurrence();
	testTousPositifs();
}

	public static void assertEquals(String message, int resAttendu, int res) {
		if (res != resAttendu) {
			throw new Error(message);
		} else {
			System.out.println("OK >> "+message);
		}
	}

	public static void assertEquals(String message, double resAttendu, double res, double eps) {
		if (Math.abs(resAttendu-res) > eps) {
				throw new Error(message);
		} else {
			System.out.println("OK >> "+message);
		}
	}

	public static void assertTrue(String message, boolean res) {
		if (!res) {
			throw new Error(message);
		} else {
			System.out.println("OK >> "+message);
		}
	}

	public static void assertFalse(String message, boolean res) {
		if (res) {
			throw new Error(message);
		} else {
			System.out.println("OK >> "+message);
		}
	}

}
