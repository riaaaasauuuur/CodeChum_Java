package Programming_1.arithmetic;
import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Celsius value: ");
        float celsius = scanner.nextFloat();

        float fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);


        scanner.close();
    }
}