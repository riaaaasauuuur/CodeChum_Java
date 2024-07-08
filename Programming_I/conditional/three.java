package Programming_1.conditional;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        int maxNumber = firstNumber; 

        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }

        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }

        System.out.println("Max: " + maxNumber);

        scanner.close();
    }
}

