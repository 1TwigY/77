import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę A ");
        int lA = scanner.nextInt();
        System.out.println("Podaj liczbę B");
        int lB = scanner.nextInt();

        if (lA > lB) {
            System.out.println("Liczba B musi byc wieksza od liczby A");
        }
        int sum = 0;
        int i = lA;
        for (i = lA; i<lB; i++) {
           sum += i;
       }
        System.out.println("Suma ciągu jest równa: " + sum );


        while (i < lB) {
            sum += i;
            i++;
        }
        System.out.println("Suma ciągu jest równa: " + sum);

        do {
            sum += i;
            i++;
        }
        while (i < lB);
        System.out.println("Suma ciągu jest równa: " + sum);
        }
    }
