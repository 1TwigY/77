import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dochód ");
        double income = scanner.nextInt();
        double tax = 0;

        if (income <= 85_528) {
            tax = (income * 0.18 - 556.02);
        } else {
            tax = ((income - 85_528) * 0.32 + 14_839.02);
        }
        System.out.println("Podatek wynosi: " + tax +"zł");
    }
}