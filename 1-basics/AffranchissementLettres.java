import java.util.Scanner;


public class AffranchissementLettres {

	static Scanner saisie;

	public static void main(String[] args) {

		saisie = new java.util.Scanner(System.in);

		int poids = 0;
		int service = 0;
		double prix = 0.00;

		poidsLettre(poids); // SAISIE POIDS LETTRE

		if (poids > 100) { // SI LETTRE TROP LOURDE
			System.out.println("Allez affranchir votre courrier dans un bureau de poste.");
		}

		else {
			choixService(service); // SAISIE CHOIX SERVICE
			// AFFICHAGE PRIX EN FONCTION POIDS ET SERVICE
			System.out.println("Le prix de l'affranchissement est de " + calculPrix(poids, service, prix) + " €.");
		}

		saisie.close();
	}

	public static int poidsLettre(int poids) {
		
		while (poids <= 0) { // OBLIGE UNE ENTREE POSITIVE
			
			System.out.print("Entrez le poids de la lettre en gramme : ");
			poids = saisie.nextInt();
			
		}
		return poids;
	}

	public static int choixService(int service) {
		
		while (service != 1 && service != 2) { // OBLIGE UN CHOIX ENTRE 1 ET 2
			
			System.out.print("Tapez 1 pour le service prioritaire\nou 2 pour le service économique : ");
			service = saisie.nextInt();
			
		}
		return service;
	}

	public static double calculPrix(int poids, int service, double prix) {

		if (poids <= 20) {
			
			if (service == 1) {
				prix = 0.60;
			}
			
			else {
				prix = 0.55;
			}
		}

		if (poids > 20 && poids <= 50) {
			
			if (service == 1) {
				prix = 1.00;
			}
			
			else {
				prix = 0.78;
			}

		}

		if (poids > 50 && poids <= 100) {
			
			if (service == 1) {
				prix = 1.45;
			} 
			
			else {
				prix = 1.00;
			}

		}
		return prix;
	}

}