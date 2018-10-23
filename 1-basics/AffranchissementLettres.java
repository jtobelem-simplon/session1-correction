import java.util.Scanner;


public class AffranchissementLettres {


/****************** REMARQUES JOSSELIN *****************
Il serait mieux de créer une variable prix (double),
afin de séparer les calculs de l'affichage.

Dans chaque cas, on calcule prix et uniquement à la fin,
on affiche.
****************** REMARQUES JOSSELIN *****************/
  public static void main(String[] args) {
    Scanner saisie = new Scanner(System.in);

    System.out.print("Quel est le poids de votre lettre ?");
    int poidsLettre =  saisie.nextInt();
    System.out.print("Service Prioritaire (1), Service Economique (2), Choisissez 1 ou 2 : ");
    int tarif = saisie.nextInt();


    if (poidsLettre <= 20 && tarif == 1) {

      System.out.println("Votre affranchissement coute : 0,6 euros.");

    } else if (poidsLettre <= 20 && tarif ==2) {

      System.out.println("votre affranchissement coute : 0,55 euros.");

    }

    if (poidsLettre < 20 && poidsLettre <50 && tarif ==1){
      System.out.println("Votre affranchissement coute : 1 euros.");

    } else if  (poidsLettre < 20 && poidsLettre <50 && tarif ==2) {

      System.out.println("Votre Affranchissment coute : 0,78 euros.");
    }

    if (poidsLettre <= 51 && poidsLettre <= 100 && tarif ==1) {
      System.out.println ("Votre affrancihssement coute : 1,45 euros.");
    } else if (poidsLettre <= 51 && poidsLettre <= 100 && tarif ==2) {
      System.out.println ("Votre affranchissement coute : 1 euros");
    }

    if (poidsLettre > 100) {
      System.out.println ("Allez donc voir à la Poste !!");
    }
  }
}
