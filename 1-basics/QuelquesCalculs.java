/****************** REMARQUES JOSSELIN *****************
Attention à l'indentation (accolades de fin toutes
au même niveau)
****************** REMARQUES JOSSELIN *****************/

/*
 * QuelquesCalculs.java
 * Ce programme permet d'essayer quelques opérations arithmétiques.
 */
import java.util.Scanner;
class QuelquesCalculs {



	public static void main (String args[]) {
	Scanner saisie = new Scanner(System.in);

		int a;
		int b;
		double x;
		double y;

		a = 12; // question 4 - remplacer ici pour saisir un int pour a
		b = 5;

		// question 3 - remplacer ici pour saisir un double pour x
		System.out.print("x = ");
		x = Double.parseDouble(saisie.nextLine());

		System.out.print("y = ");
		y = Double.parseDouble(saisie.nextLine());

		// affichage des deux entiers et de leur somme
		System.out.println("a vaut " + a + ", b vaut " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));

		// affichage des deux réels et du résultat de leur division
		System.out.println("x vaut " + x + ", y vaut " + y);
		System.out.println("x / y = "  + (x / y));


		System.out.println();  // c'est un saut de ligne

		if (x>0) {
			System.out.println("x est positif");
		}

		System.out.println();

		if (x*y<0)
			System.out.print("Le produit de x par y est négatif ");
			System.out.println("donc soit x est négatif soit y est négatif.");

		if (a%2 == 0){
			System.out.print("a%2 = " + (a%2));
			System.out.print( ", le nombre a est pair");
	}	else if (a%2 == 1){
			System.out.print("a%2 = " + (a%2));
			System.out.print( ", le nombre a est impair");

}
}
}
