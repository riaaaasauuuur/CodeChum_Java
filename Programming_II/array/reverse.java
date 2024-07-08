package Programming_II.array;

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Original array: ");
        printArray(array);
        
        reverseArray(array);
        
        System.out.print("Reverse array: ");
        printArray(array);
        
        scanner.close();
    }
}
