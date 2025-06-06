package biblio;

public class LivreEnfant extends Livre {
    private int ageMin;
    private int ageMax;

    public LivreEnfant(int isbn, String titre, int stock, double prix, int ageMin, int ageMax) {
        super(isbn, titre, stock, prix);
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    @Override
    public double prixTTC() {
        return super.prixTTC() * 0.5; // Réduction 50%
    }

    public void afficherTrancheAge() {
        System.out.println("Tranche d'âge : " + ageMin + " - " + ageMax + " ans");
    }

    @Override
    public String toString() {
        return super.toString() + " [Livre Enfant, Tranche d'âge : " + ageMin + "-" + ageMax + "]";
    }
}
