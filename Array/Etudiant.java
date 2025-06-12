package Array;

public class Etudiant extends Personne {
    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Étudiant - Nom : " + nom + ", Âge : " + age + ", Filière : " + filiere);
    }
}
