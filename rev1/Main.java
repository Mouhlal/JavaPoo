package rev1;

public class Main {
    public static void main(String[] args) {
        Client c = new Client(1, "Alice", "alice123", "pwd123", 30);
        c.afficher();

        c.ajouterPointFidélités(20); // accent sur le e
        c.afficher();

        try {
            c.retirerPointFidélités(10); // accent sur le e
            c.afficher();
        } catch (PointsFidelitesException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
