import java.util.Scanner;

/****************** REMARQUES JOSSELIN *****************
Une classe commence toujours par une majuscule

Même remarque que pour AffranchissementLettres, il est
mieux de séparer l'afficahge du calcul.

****************** REMARQUES JOSSELIN *****************/
public class billetCinema {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

  System.out.println("Quel âge avez-vous ?");
  int ageUtilisateur = sc.nextInt();

  System.out.println("Habitez-vous à Montreuil ? 1 oui / 2 non ");
  int residenceUtilisateur = sc.nextInt();


  if (ageUtilisateur <= 3 ) {

    System.out.println("Le billet est gratuit.");
  } else if (ageUtilisateur > 3 && ageUtilisateur <= 60 && residenceUtilisateur == 1) {

    System.out.println("Le billet coute 5 euros.");
  } else if (ageUtilisateur > 3 && ageUtilisateur <= 60 && residenceUtilisateur == 2) {

    System.out.println("Le billet coute 8 euros.");

  } else if (ageUtilisateur > 60) {
    System.out.println("Le billet coute 4 euros.");
  }
  }
}
