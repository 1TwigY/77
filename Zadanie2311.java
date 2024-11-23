//Napisz program ktory pobiera od uzytkownika liczbe
//calkowita dodatnia, a nastepnie wyswietla na ekranie kolejno
//wszystkie liczby nieparzyste niewieksze od podanej liczby
//Przyklad dla 15 program powinien wyswietlic 1,3,5,7,9,11,13,15


import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int liczba = scanner.nextInt();


        if (liczba > 0) {

            for (int i = 1; i <= liczba; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Podaj liczbę dodatnią!");
        }

        scanner.close();
    }
}