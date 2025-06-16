package tp2;

public class Article {
    long reference;
    String description;
    double prix ;
    int qte ;

    public Article(long reference , String description, double prix, int qte) {
        this.reference = reference;
        this.description = description;
        this.prix = prix;
        this.qte = qte;
    }
    public void approvisionner(int nombreUnites) {
        if (nombreUnites < 0) {
            throw new IllegalArgumentException("Nombre d'unités ne peut pas être négatif");
        }
        this.qte += nombreUnites;
    }
    public boolean  vendre(int nombreUnites) {
        if(nombreUnites<0){
            throw new IllegalArgumentException("Nombre d'unités ne peut pas être négatif");
        }
        if (this.qte < nombreUnites) {
            return false; // Pas assez de stock
        }
        this.qte -= nombreUnites;
        return true; // Vente réussie
    }

    public double prixTTC(){
        return this.prix*0.1 ;
    }
    public double prixVente(int nombreUnites) {
        return prixTTC() * nombreUnites ;
    }

    @Override
    public String toString(){
        return  "Article{" +
                "reference=" + reference +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", qte=" + qte +
                '}';
    }

    public static void main(String[] args) {
        Article[] articles = new Article[3];
        articles[0] = new Article(1, "Article 1", 100.0, 10);
        articles[1] = new Article(2, "Article 2", 200.0, 5);
        articles[2] = new Article(3, "Article 3", 150.0, 20);

        for (Article a : articles)
            System.out.println(a);

        System.out.println("Approvisionnement de 5 unités pour l'article 1");
        articles[0].approvisionner(5);
        articles[0].vendre(2);
        System.out.println(articles[0]);
        
        System.out.println("Vente de 3 unités pour l'article 2");
        if (articles[1].vendre(3)) {
            System.out.println("Vente réussie");
        } else {
            System.out.println("Vente échouée, pas assez de stock");
        }
      
    }
}