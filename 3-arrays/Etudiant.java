import java.util.Scanner;
import java.util.Arrays;

public class Etudiant{

  // Les propriétés sont écrites en dehors des méthodes,
  // elles sont visibles dans toute la classe (mais pas en dehors).
  private String name;

  // un tableau de double
  private double[] notes;

  private Scanner saisie = new Scanner(System.in);

  // cette méthode permet d'initialiser l'objet
  public Etudiant(String name){
    this.name = name;
  }

  /**
  * cette methode boucle pour demander la saisie de chaque note
  **/
  public void saisieNotes(int nbNote) {
    notes = new double[nbNote];
    int note;
    for (int i = 0; i < nbNote; i++ ){
      System.out.print("Saisissez une note : ");
      note = saisie.nextInt();
      notes [i] = note;
    }
  }

  /**
  * calcule la moyenne obtenue par l'étudiant. Affiche une erreur si aucune note.
  **/
  public double moyenne(){
    double resultatMoyenne;
    double sommeTableau = 0;
    for (int i = 0; i < this.notes.length; i++){
      sommeTableau += this.notes[i];
    }
    if (this.notes.length == 0){
      System.out.print("Il n'y a pas de notes...");
      return 0.0;
    }
    else {
      resultatMoyenne = sommeTableau / this.notes.length ;
      return resultatMoyenne;
    }
  }

  /**
  * retourne la note minimale obtenue
  **/
  public double minimum(){
    double min = notes[0];
    for (int i = 0; i < notes.length; i++){
      if(notes[i] < min) {
        min = notes[i];
      }
    }
    return min;
  }

  /**
  * retourne la note maximale obtenue
  **/
  public double maximum(){
    double max= notes[0];
    for (int i = 0; i < notes.length; i++){
      if(notes[i] > max) {
        max = notes[i];
      }
    }
    return min;
  }

  /**
  * indique si l'étudiant a validé son annnée (si la moyenne est >= 10)
  **/
  public boolean valide(){
    if(this.moyenne() >= 10){
      return true;
    }
    else{
      return false;
    }
  }

  /**
  * retourne la note numéro index
  **/
  public double getNote(int index){
    return this.notes[index];
  }

  /**
  * NE PAS TOUCHER
  **/
  public double[] getNotes(){
    return notes;
  }

}
