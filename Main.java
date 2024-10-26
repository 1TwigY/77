import java.util.InputMismatchException;
import java.util.Scanner;

//Sprawdzenie czy parzysta

//public class Main {
    //public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // int inputNumber = scanner.nextInt();

       // System.out.println("Podana liczba to: " + inputNumber);

   // if (inputNumber % 2 == 0){
        //System.out.println("Liczba jest parzysta");
   // }
   // else {
       // System.out.println("Liczba jest nieparzysta");
   // }

   // }
//}

//    WIĘKSZA/MNIEJSZA

//public class Main {
//    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //int inputNumber = scanner.nextInt();

        //System.out.println("Podana liczba to: " + inputNumber);
//        final int CONDITION_NUMBER = 11;

//        if (inputNumber > CONDITION_NUMBER){
//            System.out.println("Liczba jest większa od " + CONDITION_NUMBER);
//        }
//        else if (inputNumber < CONDITION_NUMBER) {
//            System.out.println("Liczba jest mniejsza od " + CONDITION_NUMBER);
//        }
//        else {
//            System.out.println("Liczba jest równa " + CONDITION_NUMBER);
//        }
//
//    }
//}

//Wypisanie ciągu znaków

//public class Main {
//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Podaj liczbę:");
//    try {
//    int inputNumber = scanner.nextInt();
//        if (inputNumber<1){
//            System.out.println("liczba powinna być większa od zera");
//        }
//    for (int i = 1; i<=inputNumber; i++) {
//        for (int j = 1; j <= inputNumber; j++) {
//            if (j == inputNumber) {
//                System.out.print(j);
//            } else {
//                System.out.print(j + ", ");
//            }
//        }
//        System.out.println();
//    }
//    } catch (Exception e) {
//        System.out.println("Podaj liczbę zamiast litery");
//    }
//    }
//    }


public class Main {
    public static void main(String[] args) {

        boolean done = false;

        while (!done) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbę:");
                int inputNumber = scanner.nextInt();

                if (inputNumber < 1) {
                    System.out.println("Podana liczba powinna być większa od 0");
                } else {
                    for (int i = 1; i <= inputNumber; i++)
                        done = true;
                }

            } catch (Exception e) {
                System.out.println("Podaj liczbę zamiast litery");
            }
        }
    }
}


