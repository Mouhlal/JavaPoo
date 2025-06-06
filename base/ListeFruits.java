package base;
import java.util.ArrayList;
import java.util.List;

public class ListeFruits {
    public static void main(String[] args) {
        // Utilisation d'une ArrayList pour stocker les noms de fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");

        // Affichage des fruits
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Affichage de la taille de la liste
        System.out.println("Nombre de fruits : " + fruits.size());
    }
}