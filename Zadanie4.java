import java.util.InputMismatchException;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int l1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbę ");
        int l2 = scanner.nextInt();
        System.out.println("Podaj znak matematyczny");
        String sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println(l1 + l2);
                break;

            case "-":
                System.out.println(l1 - l2);
                break;

            case "*":
                System.out.println(l1 * l2);
                break;
            case "/":
                System.out.println(l1 / l2);
                break;

            default:
                System.out.println("Podałeś zły znak");
        }
    }

    }

