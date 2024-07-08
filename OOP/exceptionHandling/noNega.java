package OOP.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class noNega{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                throw new IllegalArgumentException("Invalid input. The number must be positive.");
            }

            System.out.println("Entered number: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
