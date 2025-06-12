package List;

public class Main {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Youssef");
        e1.ajouterNote(14.5);
        e1.ajouterNote(16.0);
        e1.ajouterNote(12.0);

        e1.afficherInfos();

        Eleve e2 = new Eleve("Sara");
        e2.afficherInfos(); // sans note
    }
}
