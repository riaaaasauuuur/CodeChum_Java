package Programming_II.conditional;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
