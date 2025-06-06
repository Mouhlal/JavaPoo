package biblio;

public class Livre {
    private int isbn;
    private String titre;
    private int stock;
    private double prix;

    public Livre(int isbn, String titre, int stock, double prix) {
        this.isbn = isbn;
        this.titre = titre;
        this.stock = stock;
        this.prix = prix;
    }

    public double prixTTC() {
        return prix * 1.2; // TVA de 20%
    }

    @Override
    public String toString() {
        return "Livre [ISBN=" + isbn + ", Titre=" + titre + ", Stock=" + stock + ", Prix=" + prix + "]";
    }
    public int getIsbn() {
        return isbn;
    }
    public String getTitre() {
        return titre;
    }
    public int getStock() {
        return stock;
    }
    public double getPrix() {
        return prix;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

}
