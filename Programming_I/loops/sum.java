package Programming_1.loops;

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}