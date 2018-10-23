import java.util.Scanner;
import java.util.Arrays;

public class Tableaux {

	static Scanner saisie;

	public static void main(String[] args) {
		saisie = new Scanner(System.in);

		int marks[] = {25, 30, 50, 10, 5};
		int[] marks2 = new int[4];

		marks2[0] = 12;
		marks2[1] = 4;
		marks2[2] = 9;
		marks2[3] = 18;

		afficheTableau (marks);
		afficheTableau (marks2);

		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//int[] marks3 = saisirtableau(5);
		//afficheTableau(marks3);

		int[] marks4 = new int [5];
		boolean[] tab = new boolean[10];
		System.out.println(Arrays.toString(marks4));
		System.out.println(Arrays.toString(tab));

	}

	public static void afficheTableau (int[] tableau) {

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}

	public static int[] saisirtableau(int nbrItem){
		int[] tableau = new int[nbrItem];

		for (int i = 0; i < nbrItem; i++) {
			System.out.print("Entrez l'item n° " + i + " : ");
			int item = saisie.nextInt();
			tableau[i] = item;
		}
		return tableau;
	}

	//for (int mark: marks) {
	//	System.out.println(mark);
	//}


}
