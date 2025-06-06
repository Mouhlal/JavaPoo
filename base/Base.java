package Base;
import  java.util.Scanner;
public class Base {
    public static void main(String[] args) {
        System.out.println("Taper le 1er nombre");

        Scanner scanner = new Scanner(System.in) ;
        double a = scanner.nextDouble();

        System.out.println("Taper le 2eme nombre");
        double b = scanner.nextDouble();

        System.out.println("Max est " +Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(a));

        System.out.println("Taper l'opération");
        System.out.println(1+" pour addition");
        System.out.println(2+" pour soustraction");
        System.out.println(3+" pour multiplication");
        System.out.println(4+" pour division");
        System.out.println(5+" pour reste");
        int Operation = scanner.nextInt();
        double result = 0;
        switch (Operation) {
            case 1 :
                result = a + b;
                System.out.println("La somme est : " + result);
                break;
            case 2 :
                result = a - b;
                System.out.println("La soustraction est : " + result);
                break;
            case 3 :
                result = a * b;
                System.out.println("La multiplication est : " + result);
                break;
            case 4 :
                if (b != 0) {
                    result = a / b;
                    System.out.println("La division est : " + result);
                } else {
                    System.out.println("Erreur : Division par zéro");
                }
                break;
            case 5 :
                result = a % b;
                System.out.println("Le reste est : " + result);
                break;
            default :
                System.out.println("Erreur : Opération non valide");
                break;
        }
    }

}
