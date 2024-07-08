package Programming_1.loops;

import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int tempNumber = Math.abs(number); 

        do {
            tempNumber /= 10;
            count++;
        } while (tempNumber != 0);

        System.out.println("Number of digits in the given number is: " + count);

        scanner.close();
    }
}
