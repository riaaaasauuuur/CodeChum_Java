package Programming_II.recursions;

import java.util.Scanner;

public class recusive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        long result = power(base, exponent);

        System.out.println("Result is " + result);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }
}

