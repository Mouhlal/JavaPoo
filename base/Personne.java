package Base;
public class Personne {
    // Attributs privés
    private String nom;
    private int age;

    // Constructeur avec paramètres
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    // 1. Constructeur par défaut
    public Personne() {
        this.nom = "Inconnu";
        this.age = 0;
    }
    
    // 2. Constructeur avec 1 paramètre
    public Personne(String nom) {
        this.nom = nom;
        this.age = 0;
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

    // Méthode d'affichage
    public void afficherInfo() {
        System.out.println("Nom : " + nom + ", Âge : " + age);
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        // Création d'une instance de Personne
        Personne p = new Personne("Ahmed", 25);

        // Affichage des infos
        p.afficherInfo();

        // Modification des infos
        p.setNom("Karim");
        p.setAge(30);

        // Affichage après modification
        p.afficherInfo();
    }
}



/* import java.util.Scanner;
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);
System.out.print("Entrez votre nom : "); 
String nom = sc.nextLine(); 
System.out.print("Entrez votre age : "); 
int age = sc.nextInt(); 
System.out.println("Bonjour, " + nom + " !");
System.out.println("Vous avez, " + age + " ans !");
sc.close();
 } */
