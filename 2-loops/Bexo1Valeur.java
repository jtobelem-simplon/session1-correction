import java.util.Scanner;

public class Bexo1Valeur {

  static Scanner saisie;//déclaration Scanner

  public static void main(String[] args) {

    saisie = new Scanner(System.in);//init de Scanner

    int valeur, valeurmax = 0, valeurmin = 0, valeursom = 0;

    for (int i = 0; i < 10; i++) {

      System.out.println("Saisissez une valeur : ");
      valeur = saisie.nextInt();

      if (valeur > valeurmax) {
        valeurmax = valeur;
      }
      if (valeurmin == 0 || valeur < valeurmin) {
        valeurmin = valeur;
      }
      valeursom += valeur;

  }

      System.out.println("la valeur max est : " + valeurmax);
      System.out.println("la valeur min est : " + valeurmin);
      System.out.println("la somme des valeurs est : " + valeursom );
      System.out.println("la moyenne des valeurs est : " + ((double)valeursom / 10));
      saisie.close();//pour clore la saisie

  }

}
