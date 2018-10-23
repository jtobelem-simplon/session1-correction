/****************************************************************************
* TESTS, NE PAS TOUCHER les mÃ©thodes suivantes
**/
public class EtudiantTest{


  public static void main(String[] args) {
    Etudiant john = new Etudiant("John Abdulla");
    john.saisieNotes(3);

    if (john.getNotes() == null)
      throw new Error("\nKO!! >> "+"saisie des notes");

    assertEquals("saisie des notes", 3, john.getNotes().length);

    john.getNotes()[0] = 10;
    john.getNotes()[1] = 12;
    john.getNotes()[2] = 14;

    assertEquals("calcul de la moyenne", 12, john.moyenne());
    assertEquals("minimum", 10, john.minimum());
    assertEquals("maximum", 14, john.maximum());
    assertEquals("getNote", 14, john.getNote(2));
    assertTrue("valide", john.valide());

  }

  public static void assertEquals(String message, double expected, double res){
    if (Math.abs(expected-res) < 0.0001) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message);
    }
  }

  public static void assertEquals(String message, int expected, int res){
    if (expected == res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message);
    }
  }

  public static void assertTrue(String message, boolean res){
    if (res) {
      System.out.println("\nOK >> "+message);
    }
    else {
      throw new Error("\nKO!! >> "+message);
    }
  }
}
