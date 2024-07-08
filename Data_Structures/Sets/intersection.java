package Data_Structures.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersection{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of set A: ");
        int sizeA = scanner.nextInt();
        Set<Integer> setA = new HashSet<>();
        System.out.println("Enter the elements for set A:");
        for (int i = 0; i < sizeA; i++) {
            int element = scanner.nextInt();
            setA.add(element);
        }

        System.out.print("Enter the size of set B: ");
        int sizeB = scanner.nextInt();
        Set<Integer> setB = new HashSet<>();
        System.out.println("Enter the elements for set B:");
        for (int i = 0; i < sizeB; i++) {
            int element = scanner.nextInt();
            setB.add(element);
        }

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        System.out.print("The intersection of set A and set B is:");
        for (int element : intersection) {
            System.out.print(" " + element);
        }

        scanner.close();
    }
}