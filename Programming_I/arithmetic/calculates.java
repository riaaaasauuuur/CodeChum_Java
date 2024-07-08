package Programming_1.arithmetic;

import java.util.Scanner;

public class calculates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();

        int additionResult = firstNumber + secondNumber;
        System.out.println("Sum: " + additionResult);

        int subtractionResult = firstNumber - secondNumber;
        System.out.println("Difference: " + subtractionResult);

        int multiplicationResult = firstNumber * secondNumber;
        System.out.println("Product: " + multiplicationResult);

        if (secondNumber != 0) {
            int divisionResult = firstNumber / secondNumber;
            System.out.println("Quotient: " + divisionResult);
        } else {
            System.out.println("Division by zero is undefined.");
        }

        scanner.close();
    }
}
