package base;
public class Animal {
    private String nom;
    private int age;
    private  String couleur ;

    // 1. Constructeur par défaut
    public Animal() {
        this.nom = "Inconnu";
        this.age = 0;
        this.couleur = "Inconnue";
    }

    // 2. Constructeur avec 1 paramètre
    public Animal(String nom , String Couleur) {
        this.nom = nom;
        this.age = 0;
        this.couleur = Couleur;
    }

    // 3. Constructeur avec 2 paramètres
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.couleur = "Inconnue";
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour age
    public int getAge() {
        return age;
    }

    // Setter pour age
    public void setAge(int age) {
        this.age = age;
    }
    // Getter pour couleur
    public String getCouleur() {
        return couleur;
    }
    // Setter pour couleur
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Méthode d'affichage
    public void afficherInfo() {
        System.out.println("Nom : " + nom + ", Âge : " + age);
    }
}
