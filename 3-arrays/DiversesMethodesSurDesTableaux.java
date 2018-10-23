import java.util.Arrays;

public class DiversesMethodesSurDesTableaux {

	/*
	 * Retourne le nombre d'occurrences de val dans tab.
	 */
	public static int nbOccurrences (int[] tab, int val) {
		int nombre = 0;
		for (int i = 0; i < tab.length; i++){
			if (tab[i] == val){
				nombre += 1;
			}
		}
		return nombre;
	}

	/*
	 * Retourne le nombre de valeurs negatives dans tab.
	 */
	public static int nbNegatifs (int[] tab) {
		int nombre = 0;
		for (int i = 0; i < tab.length; i++){
			if (tab[i] < 0){
				nombre += 1;
			}
		}
		return nombre;
	}

	/*
	 * Retourne la somme des valeurs contenues dans un tableau de int.
	 * Cette methode retourne 0 lorsque le tableau est de longueur 0.
	 */
	public static int sommeValeurs (int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++){
			somme += tab[i];
		}
		return somme;
	}

	/*
	 * Retourne VRAI si val est present dans tab.
	 */
	public static boolean estPresent (int[] tab, int val) {
		boolean present = false;
		for (int i = 0; i < tab.length; i++){
			if (tab[i] == val){
				present = true;
			}
		}
		return present;
	}

	/*
	 * Retourne VRAI si les elements de tab sont tous >=0
	 */
	public static boolean tousPositifs (int[] tab) {
		boolean positif = true;
		for (int i = 0; i < tab.length; i++){
			if (tab[i] < 0){
				positif = false;
			}
		}
		return positif;
	}

	/*
	 * Retourne l'indice de la premiere occurrence (dans l'ordre des indices croissants) de val dans t.
	 * Retourne -1 si val n'est pas present dans t.
	 */
	public static int indicePremOccurrence(int[] tab, int val) {
		int premier = -1;
		for (int i = 0; i < tab.length; i++){
			if (premier == -1){
				if (tab[i] == val){
					premier = i;
				}
			}
		}
		return premier;
	}

	/*
	 * Retourne le nombre d'occurrences dans tab comprises
	 * entre min et max inclus.
	 * Retourne -1 si min > max
	 */
	public static int nbOccurrences (int[] tab, int min, int max) {
		int nombre = 0;
		for (int i = 0; i < tab.length; i++){
			if ((tab[i] >= min)&&(tab[i] <= max)){
				nombre += 1;
			}
		}
		if (min > max){
			nombre = -1;
		}
		return nombre;
	}

	/*
	 * Retourne la plus grande valeur positive dans tab.
	 * Si tab ne contient aucun element, ou si tab ne contient que des negatifs,
	 * cette fonction retourne -1.
	 */
	public static double plusGrandPositif (double[] tab) {
		double valeur = -1;
		Arrays.sort(tab);
		if (tab.length != 0) {
			valeur = tab[tab.length-1];
		}
		if (valeur < 0){
			valeur = -1;
		}
		return valeur;
	}

	/*
	 * Retourne le nombre d'occurences d'un bigramme dans un String.
	 */
	public static int bigramme (String mot, char[] bigramme) {
		int nombre = 0;
		for (int i = 0; i < (mot.length()-1); i++){
			String pairLettre = "" + mot.charAt(i) + mot.charAt(i+1);
			String pairBigramme = "" + bigramme[0] + bigramme[1];
			if (pairLettre.equals(pairBigramme)){
				nombre ++;
			}
		}
		return nombre;
	}

}
