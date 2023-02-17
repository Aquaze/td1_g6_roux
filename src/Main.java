import java.net.SocketOption;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        discriminant();
    }
    public static void discriminant() {
        System.out.println("Quelle est la valeur de a ?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        } else if (delta == 0) {
            System.out.println("Ce polynome a une racine reelle");
        }else {
            System.out.println("Ce polynome possède deux racines reelles");
        }

    }

}