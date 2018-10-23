/****************** REMARQUES JOSSELIN *****************
La convention de nommage est MoisHuitres (majuscule au H)
****************** REMARQUES JOSSELIN *****************/

/* demande un numéro de mois à l’utilisateur.
Si le numéro n’est pas compris entre 1 et 12, affiche une erreur.
Si le mois est compris entre 9 et 12 ou entre 1 et 4,
le programme affiche “excellente période pour manger des huîtres”.*/

import java.util.Scanner;
public class Moishuitres {

  public static void main (String[]args) {

    Scanner saisie = new Scanner(System.in);

    System.out.println("Renseignez un numéro de mois :");

    int mois = saisie.nextInt();

    if (mois < 1 || mois > 12) {
      System.out.println("Il doit y avoir une erreur");

    } else if ((mois >= 9 && mois <= 12) || (mois >=1 && mois <= 4)){
      System.out.println("Excellente periode pour manger des huitres");

    }  if (mois == 12) {
      System.out.println("N'oubliez pas le champagne!");
    }
  }
}
