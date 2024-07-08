package Programming_II.loops;

import java.util.Scanner;
public class minmax {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int max = Integer.MIN_VALUE; 
    int min = Integer.MAX_VALUE; 

    int num;
    do {
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        if (num != 0) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
    } while (num != 0);

    System.out.println("The maximum number is: " + max);
    System.out.println("The minimum number is: " + min);
    
    scanner.close();
}
}