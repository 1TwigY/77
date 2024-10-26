import java.util.Scanner;

    public class Zadanie2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę 1");
            int l1 = scanner.nextInt();
            System.out.println("Podaj liczbę 2");
            int l2 = scanner.nextInt();
            System.out.println("Podaj liczbę 3");
            int l3 = scanner.nextInt();

            if (l1 > l2 && l1 > l3 && l2 > l3) {
                System.out.println("Liczba " + l1 + " Jest największa ze zbioru a najmniejsza jest " + l3);
            } else if (l1 > l2 && l1 > l3 && l3 > l2) {
                System.out.println("Liczba " + l2 + " Jest największa ze zbioru a najmniejsza jest " + l2);
            } else if (l2 > l1 && l2 > l3 && l1 > l3) {
                System.out.println("Liczba " + l2 + " Jest największa ze zbioru a najmniejsza " + l3);
            } else if (l2 > l1 && l2 > l3 && l3 > l1) {
                System.out.println("Liczba " + l2 + " Jest największa ze zbioru a najmniejsza jest " + l1);
            } else if (l3 > l1 && l3 > l2 && l2 > l1) {
                System.out.println("Liczba " + l3 + " Jest największa ze zbioru a najmniejsza jest " + l1);
            } else if (l3 > l1 && l3 > l2 && l1 > l2) {
                System.out.println("Liczba " + l3 + " Jest największa ze zbioru a najmniejsza jest " + l2);
            }
        }
}
