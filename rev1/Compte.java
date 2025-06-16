package rev1;


public class Compte {
    private String login;
    private String password;

    //Par parametre
    public Compte(String login, String password) {
        this.login = login;
        this.password = password;
    }
//default
     public Compte() {
        this.login = "login";
        this.password = "password";
    }
//copie
    public Compte(Compte compte) {
        this.login = compte.login;
        this.password = compte.password;
    }

    @Override
    public String toString() {
        return "login=" + login + ", password=" + password;
    }
}
