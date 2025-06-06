package base;

public class Article {
    private long reference;
    private String description;
    private double prixHT;
    private int stocks;

    // Constructeur par défaut
    public Article() {
        this.reference = 0;
        this.description = "Inconnu";
        this.prixHT = 0.0;
        this.stocks = 0;
    }

    public Article(long reference, String description, double prixHT, int stocks) {
        this.reference = reference;
        this.description = description;
        this.prixHT = prixHT;
        this.stocks = stocks;
    }

    public void approvisionner(int nbrU) {
        this.stocks += nbrU;
    }

    public boolean vendre(int nbrU) {
        if (this.stocks >= nbrU) {
            this.stocks -= nbrU;
            return true;
        } else {
            return false;
        }
    }

    public double prixTTC() {
        double tva = 0.1;
        return this.prixHT * (1 + tva);
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Article article = new Article(12345, "Stylo", 10.0, 100);
        System.out.println("Prix TTC : " + article.prixTTC());
    }
}
