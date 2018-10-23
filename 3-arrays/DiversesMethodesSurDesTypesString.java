public class DiversesMethodesSurDesTypesString {

	/*
	 * Retourne le nombre d'occurrences de c dans s.
	 */
	public static int nbOccurrences(String s, char c) {
		int nbOccurrences = 0;
		for (int i = 0 ; i <  s.length() ; i++)
			if (s.charAt(i) == c) {
				nbOccurrences += 1;
			}
		return nbOccurrences;
	}



/****************************************************************
* méthodes de test, NE PAS TOUCHER CE QUI SUIT
*/
public static void testNbOccurrences(String message, int resAttendu, int res) {
	if (res != resAttendu) {
		throw new Error(message);
	} else {
		System.out.println("OK >> "+message);
	}
}

	public static void main(String[] args){
		testNbOccurrences("cas longueur 1 c present", 1, nbOccurrences("a", 'a'));
		testNbOccurrences("cas longueur 1 c absent", 0, nbOccurrences("b", 'a'));
		testNbOccurrences("cas longueur >1 c en premier", 1, nbOccurrences("ajlksdfjlk", 'a'));
		testNbOccurrences("cas longueur >1 c en dernier", 1, nbOccurrences("jlksdfjla", 'a'));
		testNbOccurrences("cas longueur >1 que des c", 10, nbOccurrences("aaaaaaaaaa", 'a'));
		testNbOccurrences("cas longueur >1 c absent", 0, nbOccurrences("jlksdfjlk", 'a'));
		testNbOccurrences("cas longueur >1 cas moyen", 6, nbOccurrences("jalkasdaafajalk", 'a'));
		testNbOccurrences("cas longueur 0", 0, nbOccurrences("", 'a'));
	}

}
