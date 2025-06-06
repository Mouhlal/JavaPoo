package Base;
import java.util.ArrayList;
public class Participant extends Personne {
    private String profession;
    private ArrayList<Formation> formations;

    public Participant(int id, String nom, String email, String profession) {
        super(id, nom, email);
        this.profession = profession;
        this.formations = new ArrayList<>();
    }

    public void ajouterFormation(Formation f) {
        formations.add(f);
    }

    @Override
    public void afficherInfos() {
        System.out.println("Participant: " + nom + ", Email: " + email + ", Profession: " + profession);
        System.out.println("Formations suivies : ");
        for (Formation f : formations) {
            f.afficherDetails();
            System.out.println("-----");
        }
    }
}
