package Array;

public class Personne {
    protected String nom;
    protected int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", Âge : " + age);
    }
}
