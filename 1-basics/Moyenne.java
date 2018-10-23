/****************** REMARQUES JOSSELIN *****************
Code bien nettoyé.

On pourrait donner un nom plus parlant aux variables,
x3 est le résultat et x et x2 sont nb1 et nb2 par exemple
****************** REMARQUES JOSSELIN *****************/

/*
Calcule la moyenne de deux notes
*/
import java.util.Scanner;

public class Moyenne {

  public static void main(String[] args) {

    Scanner saisie = new Scanner(System.in);

    double x, x2 ,x3;

    System.out.println("Entrez 2 notes : ");

    x = Double.parseDouble(saisie.nextLine());
    x2 = Double.parseDouble(saisie.nextLine());

    x3=(x+x2)/2.0;



    System.out.println("Votre moyenne est : " + x3);
  }
}
