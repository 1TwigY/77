import java.util.InputMismatchException;
import java.util.Scanner;

//Zadanie1
//Program do konwertowania temperatury w stopniach celcjusza na fahrenheita wzór Celcjusz * 1.8 + 32
public class Zadanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość stopni Celcjusza:");
        double celcjusz = scanner.nextDouble();
        double fahrenheit = celcjusz * 1.8 + 32;

        System.out.println(celcjusz + " Stopni Celcjusza jest równe " + fahrenheit + " Stopni Fahrenheita ");
    }
}


