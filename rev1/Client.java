package rev1;

public class Client extends User implements IMembre {
    private int pointsFidelites;
    private static int totalPointsFidelites = 0;

    public Client(int code, String nom, String login, String password, int pointsFidelites) {
        super(code, nom, login, password);
        this.pointsFidelites = pointsFidelites;
        totalPointsFidelites += pointsFidelites;
    }

    @Override
    public void ajouterPointFidélités(int nombre) { // nom conforme à l'interface
        pointsFidelites      += nombre;
        totalPointsFidelites += nombre;
        System.out.println("+" + nombre + " PF, total global = " + totalPointsFidelites);
    }

    @Override
    public void retirerPointFidélités(int nombre) throws PointsFidelitesException { // nom conforme à l'interface
        if (nombre > pointsFidelites)
            throw new PointsFidelitesException("Pas assez de points !");
        pointsFidelites      -= nombre;
        totalPointsFidelites -= nombre;
        System.out.println("-" + nombre + " PF, total global = " + totalPointsFidelites);
    }

    @Override
    public int convertirPFenDH() {
        return pointsFidelites / 15;      // 15 PF = 1 DH
    }

    @Override
    public void afficher() {
        System.out.println("Client : " + super.toString() +
                           ", PF=" + pointsFidelites +
                           ", PF globaux=" + totalPointsFidelites +
                           ", Valeur=" + convertirPFenDH() + " DH");
    }
}
