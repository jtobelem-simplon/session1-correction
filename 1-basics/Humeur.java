import java.util.Scanner;

/****************** REMARQUES JOSSELIN *****************
Le code est propre.

Quelques tests inutiles, par ex pas nécessaire de tester
reponse.length()<= 20 dans le else if de
reponse.length()>= 20
****************** REMARQUES JOSSELIN *****************/
public class Humeur {

  public static void main(String[] args) {

    Scanner saisie = new Scanner (System.in);

    System.out.println("Décrivez votre humeur :");

    String reponse = saisie.nextLine();

    if (!Character.isUpperCase(reponse.charAt(0)))  {
      System.out.println("Erreur, votre reponse doit commencer par une majuscule");
    }
    else if ( reponse.charAt(reponse.length()-1) != '.')  {
      System.out.println("Votre reponse doit se terminee par un '.'");
    }
    else if ((reponse.length() <= 5)){
      System.out.println("faites un effort, j’aimerais en savoir plus");
    }
    else if ((reponse.length() >= 20)){
      System.out.println("pourriez-vous être plus concis");
    }
    else if (((reponse.length())%2 == 0) && (reponse.length() > 5) && (reponse.length()<= 20)) {
      System.out.println("c’est très intéressant, on peut en parler plus tard?");
    }
    else if ((reponse.length())%2 == 1  && (reponse.length() > 5) && (reponse.length()<= 20)) {
      System.out.println("c’est bien ce que je pensais");
    }
  }
}
