package Programming_II.loops;

import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
      
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
        
        scanner.close();
    }
}
