import java.util.Scanner;

public class Dexo3Rebours {

  static Scanner saisie;

  public static void main(String[] args) {

    saisie = new Scanner(System.in);

    rebours();
    saisie.close();
  }

  public static void rebours() {


    int i;
    int n;
    System.out.println("Saisissez un entier : ");
    n = saisie.nextInt();

    i = n;

    // METTRE EN BOUCLE POUR EVITER CES REPETITIONS !!!

    if (i % 10 == 0) {
      System.out.println("\t\t\t\t\t\t\t\t\t\t" + i);
    }
    if (i % 10 == 1) {
      System.out.print("\t\t\t\t\t\t\t\t\t" + i);
    }
    if (i % 10 == 2) {
      System.out.print("\t\t\t\t\t\t\t\t" + i);
    }
    if (i % 10 == 3) {
      System.out.print("\t\t\t\t\t\t\t" + i);
    }
    if (i % 10 == 4) {
      System.out.print("\t\t\t\t\t\t" + i);
    }
    if (i % 10 == 5) {
      System.out.print("\t\t\t\t\t" + i);
    }
    if (i % 10 == 6) {
      System.out.print("\t\t\t\t" + i);
    }
    if (i % 10 == 7) {
      System.out.print("\t\t\t" + i);
    }
    if (i % 10 == 8) {
      System.out.print("\t\t" + i);
    }
    if (i % 10 == 9) {
      System.out.print("\t" + i);
    }
    for (i = n - 1; i >= 0; i--) {
      if (i % 10 == 0) {
        System.out.println("\t" + i);
    }
      else if (i % 10 == 9) {
        System.out.print("\t" + i);
      }
      else {
        System.out.print("\t" + i);
      }
    }

  }
}
