package Programming_1.conditional;

import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        scanner.close();
    }
}
