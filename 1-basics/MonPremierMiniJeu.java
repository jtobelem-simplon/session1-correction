/****************** REMARQUES JOSSELIN *****************
RAS
****************** REMARQUES JOSSELIN *****************/

/*
 * MonPremierMiniJeu.java
 * C'est un jeu à deux joueurs.
 * Le programme demande le pseudo de chacun des joueurs.
 * Celui dont le pseudo est le plus long a gagné.
 * Pour simplifier, on considère ici que n'importe quelle suite de caractères constitue un pseudo.
 * (Bon d'accord ce n'est pas passionnant comme jeu mais pour une première séance ce n'est pas si mal...)
 */
import java.util.Scanner;
public class MonPremierMiniJeu {

	public static void main (String[] args){

		Scanner saisie = new Scanner(System.in);

		String pseudoJoueur1, pseudoJoueur2;

		// saisie des pseudos des joueurs
		System.out.print("Joueur 1 entrez votre pseudo :");
		pseudoJoueur1 = saisie.nextLine();

		System.out.print("Joueur 2 entrez votre pseudo :");
		pseudoJoueur2 = saisie.nextLine();

		System.out.println("Le joueur 1 s'appelle : " + pseudoJoueur1);
		System.out.println("Le joueur 2 s'appelle : " + pseudoJoueur2);

		// qui gagne ?
		if (pseudoJoueur1.length() < pseudoJoueur2.length()) {

			System.out.println("C'est " + pseudoJoueur2 + " qui gagne !");

		}
		else if (pseudoJoueur1.length() > pseudoJoueur2.length()) {

			System.out.println("C'est " + pseudoJoueur1 + " qui gagne !");

		} else {

			System.out.println("Egalite");

		}
		saisie.close();
	}
}
