/****************** REMARQUES JOSSELIN *****************
Attention à l'indentation (accolades de fin toutes
au même niveau)
****************** REMARQUES JOSSELIN *****************/

/*  demande le rayon d’un cercle. Si le rayon est positif le programme affiche
l’aire et le périmètre du cercle et sinon une erreur.
*/
import java.util.Scanner;
public class RayonCercle{

  final static double PI=3.14;
  public static void main (String args[]) {

    Scanner saisie = new Scanner (System.in);


    System.out.println("Entrez le rayon du cercle :");
    int rayon = saisie.nextInt();

    if (rayon % 2 == 0) {
      System.out.println("L'aire du cercle de rayon " + rayon + " = " + (PI*(rayon*rayon)) + "cm²");
      System.out.println("Son périmètre est égal à : " + (2*PI*rayon) + "cm");
    }
  }
}
