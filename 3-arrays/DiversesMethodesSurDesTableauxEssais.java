import java.util.Scanner;

public class DiversesMethodesSurDesTableauxEssais {

	public static void main(String[] args){

		Scanner saisie = new Scanner(System.in);
		System.out.print("Veuillez entrer un mot :");
		String mot = saisie.next();
		char[] bigramme = {'t', 't'};

		System.out.print("Nombre d'occurences du bigramme :");
		System.out.print(DiversesMethodesSurDesTableaux.bigramme(mot, bigramme));

	}
}
