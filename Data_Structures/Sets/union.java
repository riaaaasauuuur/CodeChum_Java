package Data_Structures.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class union{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the size of set A: ");
        int sizeA = scanner.nextInt();
        scanner.nextLine(); 
      
        Set<String> setA = new LinkedHashSet<>();
        System.out.println("Enter the elements for set A:");
        for (int i = 0; i < sizeA; i++) {
            String element = scanner.nextLine();
            setA.add(element);
        }
        
        System.out.print("Enter the size of set B: ");
        int sizeB = scanner.nextInt();
        scanner.nextLine();
        
        Set<String> setB = new LinkedHashSet<>();
        System.out.println("Enter the elements for set B:");
        for (int i = 0; i < sizeB; i++) {
            String element = scanner.nextLine();
            setB.add(element);
        }
        
        Set<String> unionSet = new LinkedHashSet<>(setA);
        unionSet.addAll(setB);
        
        System.out.print("The union of set A and set B is: ");
        for (String element : unionSet) {
            System.out.print(element + " ");
        }
    }
}