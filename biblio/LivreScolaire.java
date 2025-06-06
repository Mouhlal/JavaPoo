package biblio;

public class LivreScolaire extends Livre {
    private String discipline;
    private String niveau;

    public LivreScolaire(int isbn, String titre, int stock, double prix, String discipline, String niveau) {
        super(isbn, titre, stock, prix);
        this.discipline = discipline;
        this.niveau = niveau;
    }

    @Override
    public double prixTTC() {
        return super.prixTTC() * 0.7; // Réduction 30%
    }

    public void afficherDiscipline() {
        System.out.println("Discipline : " + discipline);
    }

    @Override
    public String toString() {
        return super.toString() + " [Livre Scolaire, Discipline: " + discipline + ", Niveau: " + niveau + "]";
    }
}
