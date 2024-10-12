import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        System.out.println("Podana liczba to: " + inputNumber);

    if (inputNumber % 2 == 0){
        System.out.println("Liczba jest parzysta");
    }
    else {
        System.out.println("Liczba jest nieparzysta");
    }

    }
}
