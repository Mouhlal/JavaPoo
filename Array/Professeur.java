package Array;

public class Professeur extends Personne {
    private String specialite;

    public Professeur(String nom, int age, String specialite) {
        super(nom, age);
        this.specialite = specialite;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Professeur - Nom : " + nom + ", Âge : " + age + ", Spécialité : " + specialite);
    }
}
