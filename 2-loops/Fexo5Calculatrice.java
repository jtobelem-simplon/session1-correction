import java.util.Scanner;

public class Fexo5Calculatrice {

  static Scanner saisie;

  public static void main(String[] args) {

    saisie = new Scanner(System.in);

    calculatrice();
    saisie.close();
  }

  public static void calculatrice() {

    double n1, n2;
    int choix;

    System.out.println("Entrez un premier nombre : ");
    n1 = Double.parseDouble(saisie.nextLine());
    System.out.println("Entrez un deuxième nombre : ");
    n2 = Double.parseDouble(saisie.nextLine());

    do {

      System.out.println("1 - Addition");
      System.out.println("2 - Soustraction");
      System.out.println("3 - Division");
      System.out.println("4 - Multiplication");
      System.out.println("5 - Exit");

      System.out.println("Entrez le numéro de l'opération voulue : ");
      choix = saisie.nextInt();

      if (choix == 1) {
        System.out.println("L'addition donne : " + (n1 + n2));
      }
      if (choix == 2) {
        System.out.println("La soustraction donne : " + (n1 - n2));
      }
      if (choix == 3) {
        System.out.println("La division donne : " + (n1 / n2));
      }
      if (choix == 4) {
        System.out.println("La multiplication donne : " + (n1 * n2));
      }
    } while (choix < 5);
  }
}
