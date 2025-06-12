package Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();


        personnes.add(new Etudiant("Ali", 20, "Informatique"));
        personnes.add(new Professeur("Mme Karima", 45, "Mathématiques"));
        personnes.add(new Etudiant("Sara", 22, "Gestion"));
        personnes.add(new Professeur("M. Youssef", 50, "Physique"));

        for (Personne p : personnes) {
            p.afficherInfos();
        }
    }
}
