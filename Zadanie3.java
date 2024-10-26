//Zadanie3
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Kalkulator rat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę");
        double price = scanner.nextDouble();
        System.out.println("Podaj liczbe rat");
        double rate = scanner.nextDouble();

        scanner.close();

        double multiplier;

        System.out.println("Kwota produktu:" + price);
        System.out.println("Liczba rat:" + rate);
        System.out.println();

            if (rate >=6 && rate <= 12) {
                multiplier = 0.225;
            } else if (rate>12 && rate<=24) {
                multiplier = 0.05;
            }
            else{
                    multiplier = 0.1;

            }
            double ratevalue = price/rate;
        System.out.println("Miesięczna rata wynosi: " + ratevalue);
            double rateprice = price * multiplier;
        System.out.println("Kwota odsetek: " + rateprice );
            double finalprice = price + rateprice;
        System.out.println("Cena całkowita: " + finalprice);
            }

        }

