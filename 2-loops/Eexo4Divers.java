import java.util.Scanner;

public class Eexo4Divers {

  static Scanner saisie;

  public static void main(String[] args) {

    saisie = new Scanner(System.in);

    triangle();
    alphabet();
    diviseur();
    saisie.close();
  }

  public static void triangle() {
    int i, n, lgn;

    System.out.print("Saisissez le nombre de ligne du triangle : ");
    lgn = saisie.nextInt();

    for (n = 1; n <= lgn; n++) {

      int affiche = 1;

      for (i = 1; i <= n; i++) {

        System.out.print(affiche);

        if (affiche == 9) {
          affiche = 1;
        }
        else {
          affiche++;
        }
      }

      System.out.println();
    }
  }

  public static void alphabet() {

    for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {

    System.out.print(alphabet + "\t");
    }
  }


  public static void diviseur() {

    int u, d, nbrd, somd = 0;

    System.out.println();
    System.out.print("Saisissez un nombre : ");
    d = saisie.nextInt();


    for ( u = 1; u <= d; u++) {

      nbrd = d % u;

      if (nbrd == 0) {

        System.out.println(u);

        somd += u;
      }
    }

    System.out.println(somd);
  }
}
