import java.util.Scanner;

public class Cexo2NbrEntier {

  static Scanner saisie;//déclaration Scanner

  public static void main(String[] args) {

    saisie = new Scanner(System.in);

    Nombre();
    Nom();
    Mail();
    saisie.close();

  }

    public static void Nombre() {
      int n;
      do {
      System.out.println("Saisissez un nombre entre 1 et 20 : ");
      n = saisie.nextInt();
      } while (n <= 0 || n > 20);
    }

    public static void Nom() {
      String nom = "";  // renvois à rien, "" renvois avec des caracteres
      do {
        System.out.println("tapez votre nom : ");
        nom = saisie.nextLine();
      } while (!nom.matches("[a-zA-Z]+")); // + au moins un fois
    }

    public static void Mail() {
      String mail = "";
      do {
        System.out.println("tapez votre mail : ");
        mail = saisie.nextLine();
      } while (!mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"));
    }
}
