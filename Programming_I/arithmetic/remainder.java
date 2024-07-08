package Programming_1.arithmetic;

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int remainder = firstNumber % secondNumber;

        System.out.println("Remainder of " + firstNumber + "/" + secondNumber + " is: " + remainder);

        scanner.close();
    }
}