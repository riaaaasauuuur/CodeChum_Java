package Programming_II.array;

import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = scanner.nextInt();
        }
        
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
        
        scanner.close();
    }
    
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; 
        int totalSum = (n * (n + 1)) / 2; 
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }
}
