package rev1;

public interface IMembre {
    void ajouterPointFidélités(int nombre);
    void retirerPointFidélités(int nombre) throws PointsFidelitesException;
    int convertirPFenDH();
    void afficher();
}

