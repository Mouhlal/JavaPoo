package rev1;


public class Compte {
    private String login;
    private String password;

    public Compte(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Compte(Compte compte) {
        this.login = compte.login;
        this.password = compte.password;
    }

    // Getters & setters si besoin

    @Override
    public String toString() {
        return "login=" + login + ", password=" + password;
    }
}
