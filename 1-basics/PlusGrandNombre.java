/****************** REMARQUES JOSSELIN *****************
Bien.
****************** REMARQUES JOSSELIN *****************/

/* demande une saisie de 3 numéros, renvoie au plus grand des 3*/
import java.util.Scanner;
public class PlusGrandNombre{

  public static void main(String[] args) {




    Scanner saisie = new Scanner(System.in);

    System.out.println("Renseignez un nombre A : ");
    int nombreA = saisie.nextInt();

    System.out.println("Renseignez un nombre B : ");
    int nombreB = saisie.nextInt();

    System.out.println("Renseignez un nombre C :");
    int nombreC = saisie.nextInt();

    if (nombreA >= nombreB && nombreA >= nombreB){
      System.out.println(nombreA + " est le plus grand");
    } else if (nombreB >= nombreA && nombreB >= nombreC){
      System.out.println(nombreB + "est le plus grand");
    } else if (nombreC >= nombreA && nombreC>= nombreB){
      System.out.println(nombreC + "est le plus grand");
    }

  }
}
