import java.lang.StringBuilder;
import java.util.Scanner;

public class Renverser {
	static Scanner saisie;

	public static void main(String[] args) {
		saisie = new Scanner(System.in);
		String unMot = "coucou";
		String maj = majuscule(unMot);
		String invers = inverser(maj);

		System.out.println("Mot de base : " + unMot);
		System.out.println("Mot renverse : " + invers);

		lettres("Bonjour");

		System.out.print("Saisissez un mot : ");
		String wordUser = saisie.next();

		if (isDeuxMots(wordUser)) {
			System.out.println("Ce mot est compose de deux fois le meme mot !");
		}
		else {
			System.out.println("Ce mot ne contient pas deux fois le meme mot !");
		}

		if (isPalindrome(wordUser)) {
			System.out.println("Ce mot est un palindrome !");
		}
		else {
			System.out.println("Ce mot n'est pas un palindrome !");
		}

	}

	//exo1
	public static void lettres(String mot){
		System.out.println(mot + " : ");
		for (int i = 0; i < mot.length(); i++){
			System.out.println(mot.charAt(i));
		}
	}

	//exo2
	public static String majuscule(String mot){
		String upper = mot.toUpperCase();
		return upper;
	}

	public static String inverser(String mot){
		String invers = new StringBuilder(mot).reverse().toString();
		return invers;
	}

	//exo3
	public static boolean isDeuxMots(String mot){
		boolean isMemeMot = false;
		if (mot.length() % 2 == 0) {
			int moitierLettres = mot.length()/2;
			String moitierMot = mot.substring(moitierLettres);
			String deuxMoitiers = moitierMot + moitierMot;
			isMemeMot = mot.equals(deuxMoitiers);
		}
		else {
			isMemeMot = false;
		}
		return isMemeMot;
	}

	//exo4
	public static boolean isPalindrome(String mot){
		String maj = majuscule(mot);
		String invers = inverser(maj);
		boolean isPal = maj.equals(invers);
		return isPal;
	}
}
