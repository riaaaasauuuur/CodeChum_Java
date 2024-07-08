package Programming_1.functions;

import java.util.Scanner;
public class factorials {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = factorial(number);

        System.out.println("The factorial of the given number is " + result);

        scanner.close();
    }
}
