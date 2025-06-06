package rev1;

public abstract class User {
    private int code;
    private String nom;
    private Compte compte;

    public User(int code, String nom, String login, String password) {
        this.code = code;
        this.nom = nom;
        this.compte = new Compte(login, password);
    }
    public User(User u) {
        this.code = u.code;
        this.nom  = u.nom;
        this.compte = new Compte(u.compte);
    }
    @Override
    public String toString() {
        return "code=" + code + ", nom=" + nom + ", compte={" + compte + "}";
    }
}
