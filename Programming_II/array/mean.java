package Programming_II.array;

import java.util.Scanner;
public class mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int N = scanner.nextInt();
        
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }
        
        double mean = getArrayMean(array);
        
        System.out.printf("Mean of array is %.2f\n", mean);
        
        scanner.close();
    }
    
    public static double getArrayMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
