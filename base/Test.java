package Base;
import java.util.Scanner;


public class Test {
    private String name;
    private String adresse;
    private int age; 

    public Test() {
        this.name = "Inconnu";
        this.adresse = "Inconnu";
        this.age = 0;
    }

    public Test(String name, int age, String adresse) {
        this.name = name;
        this.age = age;
        this.adresse = adresse;
    }

    public void AfficherTest(){
        System.out.println("Nom : " + name + "Age: " + age + " Adresse: " + adresse);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saisirAge() {
        System.out.print("Taper l'age : ");
        Scanner sc = new Scanner(System.in);
        this.age = sc.nextInt();
        // Ne pas fermer le Scanner ici pour éviter de fermer System.in
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.saisirAge();
        System.out.println("L'age saisi est : " + test.getAge());
        
        // Exemple d'utilisation du constructeur avec paramètres
        Test test2 = new Test("Alice", 30, "Paris");
        System.out.println("Nom: " + test2.getName() + ", Age: " + test2.getAge() + ", Adresse: " + test2.adresse);
    }
}
