import java.util.Scanner;

/* Bonjour.java : ce programme affiche un message de bienvenue  */
class BonjourCasimir {


  /****************** REMARQUES JOSSELIN *****************
  RAS
  ****************** REMARQUES JOSSELIN *****************/
  public static void main(String[] args) {
    Scanner saisie = new Scanner(System.in);

    String nomUtilisateur;

    System.out.print("Entrez votre nom :");
    nomUtilisateur = saisie.nextLine();

    System.out.println("Hello "+ nomUtilisateur);

  }

}
