import java.util.Scanner;
import java.util.Random;
import java.lang.Character;

public class Pendu {

	static String[] motATrou;
	static int nombreErreur;
	static int nombreToursTotal;
	static int nombreLettresDiff;
	static String motADeviner;
	static char lettreUtilisateur;
	static boolean continuer;
	static int choixNiveau;

	public static void main(String[] args){

		//Choix aléatoire du mot à deviner
		String[] tableauDeMots = {"SUPER MOT", "UN AUTRE MOT", "MOT A DEVINER"};
		int nbAleatoire = new Random().nextInt(tableauDeMots.length);
		motADeviner = tableauDeMots[nbAleatoire];
		//nombre de lettres differentes dans le mot a deviner
		nombreLettresDiff = (int)motADeviner.chars().filter(Character::isAlphabetic).distinct().count();

		//Choix du niveau par l'utilisateur
		Scanner saisie = new Scanner(System.in);
		System.out.println("\n\n\n-------------------------");
		System.out.println("Bienvenue dans le Pendu !");
		System.out.println("-------------------------\n");
		System.out.print("Choisissez un niveau\n1: Facile\n2: Moyen\n3: Difficile\nVotre choix : ");
		choixNiveau = saisie.nextInt();

		//Nombre de coups en fonction du nombre de lettres differentes et du niveau choisi
		if(choixNiveau == 1){
			nombreToursTotal = nombreLettresDiff + 2;
		}
		else if (choixNiveau == 2){
			nombreToursTotal = nombreLettresDiff + 1;
		}
		else if (choixNiveau == 3){
			nombreToursTotal = nombreLettresDiff;
		}
		System.out.println("Vous avez " + nombreToursTotal +" coups pour trouver.\n\n");

		nombreErreur = 0;
		continuer = true;
		motATrou = new String[motADeviner.length()];

		//Affichage des traits suivant le nombre de lettres
		//et affichage de la premiere et derniere lettre
		for (int i = 0; i < motADeviner.length(); i++){

			if (i == 0) {
				motATrou[i] = "" + motADeviner.charAt(i);
			}
			else if (i == motADeviner.length() - 1){
				motATrou[i] ="" + motADeviner.charAt(i);
			} else{
				if(motADeviner.charAt(i) == ' '){
					motATrou[i] = (" ");
				}
				else{
					motATrou[i] = ("_");
				}
			}
		}

		afficherMotATrou();

		//Boucle jeu
		do {
			System.out.print("\nVeuillez entrer une lettre : ");
			lettreUtilisateur = saisie.next().toUpperCase().charAt(0);

			lettreAjoutee(lettreUtilisateur);
			afficherMotATrou();

			//Condition de victoire ou de defaite
			if (renvoieMotSansTrou().equals(motADeviner)){
				if (nombreErreur == 1){
					System.out.println("Bravo !!! Vous avez gagne en ne faisant que " + nombreErreur + " erreur !");
				}
				else if (nombreErreur == 0){
					System.out.println("Bravo !!! Vous avez gagne en ne faisant aucune " + nombreErreur + " erreur !");
				}
				else{
					System.out.println("Bravo !!! Vous avez gagne en ne faisant que " + nombreErreur + " erreurs !");
				}
				continuer = false;
			}
			else {
				if (nombreErreur == nombreToursTotal){
					System.out.println("Vous avez perdu !! Desole...");
					continuer = false;
				} else{
					System.out.println("Il vous reste " + (nombreToursTotal - nombreErreur) + " tours...");
				}
			}
		} while (continuer);

	}//Fin du Main


	//Méthode qui ajoute une erreur si la lettre n'est pas dans le mot
	//et qui rempli motATrou.
	public static void lettreAjoutee(char lettre){
		int lettreDansMot = 0;
		for (int i = 0; i < motADeviner.length(); i++){

			if (motADeviner.charAt(i) == lettre){
				motATrou[i] = "" + lettre;
				lettreDansMot ++;
			}
		}
		if (lettreDansMot == 0){
			nombreErreur ++ ;
		}
	}

	//Méthode qui affiche le motATrou avec des espaces
	public static void afficherMotATrou(){
		String leMot = "";
		for (int i = 0; i < motATrou.length; i++){
			leMot += motATrou[i] + " ";
		}
		System.out.print("Mot a deviner : ");
		System.out.println(leMot);
	}

	//Méthode qui renvoie le motATrou sans espaces
	public static String renvoieMotSansTrou(){
		String leMot = "";
		for (int i = 0; i < motATrou.length; i++){
			leMot += motATrou[i];
		}
		return leMot;
	}
}
