package List;

import java.util.ArrayList;
import java.util.List;

public class Eleve {
    private String nom;
    private List<Double> listeNotes;
    private double moyenne;

    // Constructeur
    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0;
    }

    // Ajouter une note
    public void ajouterNote(double note) {
        listeNotes.add(note);
        calculerMoyenne();
    }

    // Calcul de la moyenne
    private void calculerMoyenne() {
        if (listeNotes.isEmpty()) {
            moyenne = 0;
        } else {
            double somme = 0;
            for (double note : listeNotes) {
                somme += note;
            }
            moyenne = somme / listeNotes.size();
        }
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public List<Double> getListeNotes() {
        return listeNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    // Affichage
    public void afficherInfos() {
        System.out.println("Élève : " + nom);
        System.out.println("Notes : " + listeNotes);
        System.out.println("Moyenne : " + moyenne);
    }
}
