package biblio;

public class biblio {
    public static void main(String[] args) {
        Livre[] livres = new Livre[3];
        livres[0] = new Livre(1001, "Les Misérables", 10, 150);
        livres[1] = new LivreEnfant(1002, "Le Petit Prince", 5, 100, 6, 10);
        livres[2] = new LivreScolaire(1003, "Mathématiques Terminale", 7, 200, "Mathématiques", "Terminale");

        for (Livre l : livres) {
            System.out.println(l);
            System.out.println("Prix TTC : " + l.prixTTC());

            if (l instanceof LivreEnfant) {
                ((LivreEnfant) l).afficherTrancheAge();
            } else if (l instanceof LivreScolaire) {
                ((LivreScolaire) l).afficherDiscipline();
            }

            System.out.println("-----");
        }
    }
}
