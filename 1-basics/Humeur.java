import java.util.Scanner;

public class Humeur {

	static Scanner saisie;

	public static void main(String[] args) {

		saisie = new Scanner(System.in);

		String humeur = null;

		reponseHumeur(saisieHumeur(humeur));
		saisie.close();

	}

	// SAISIE HUMEUR JUSQU'A CE QUE TOUTES LES CONDITIONS SOIENT VALIDEES
	public static String saisieHumeur(String humeur) {

		do {

			System.out.print("Décrivez votre humeur : ");
			humeur = saisie.nextLine();

			if (!Character.isUpperCase(humeur.charAt(0))) { // COMMENCE PAR UNE MAJUSCULE
				System.out.println("Erreur, votre reponse doit commencer par une majuscule.");
			}

			else if (humeur.charAt(humeur.length() - 1) != '.') { // FINIT PAR UN POINT
				System.out.println("Erreur, votre reponse doit se terminer par un '.'.");
			}

			else if ((humeur.length() <= 5)) { // PLUS DE 5 CARACTERES
				System.out.println("Faites un effort, j’aimerais en savoir plus");
			}

			else if ((humeur.length() >= 20)) { // MOINS DE 20 CARACTERES
				System.out.println("Pourriez-vous être plus concis");
			}

		} while (!Character.isUpperCase(humeur.charAt(0)) 
				|| humeur.charAt(humeur.length() - 1) != '.'
				|| humeur.length() <= 5 || humeur.length() >= 20);
		return humeur;
	}
	
	public static String reponseHumeur(String humeur) {
		
		if (humeur.length()%2 == 0) { // NOMBRE CARACTERES PAIR
			System.out.println("C'est très intéressant ! On peut en parler plus tard ?");
		}
		
		else if (humeur.length()%2 == 1) { // NOMBRE CARACTERES IMPAIR
			System.out.println("C'est bien ce que je pensais !");
		}
		
		return humeur;
		
	}

}