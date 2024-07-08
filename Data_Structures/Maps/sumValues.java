package Data_Structures.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class sumValues{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the map: ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine(); 
      
        Map<String, Integer> map = new LinkedHashMap<>();
        
        System.out.println("Enter the key-value pairs for the map:");
        for (int i = 0; i < numberOfElements; i++) {
            String input = scanner.nextLine();
            String[] keyValue = input.split(":");
            if (keyValue.length == 2) {
                try {
                    int value = Integer.parseInt(keyValue[1]);
                    map.put(keyValue[0], value);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid value. Please enter an integer value.");
                    i--; 
                }
            } else {
                System.out.println("Invalid input. Please enter in the format key:value");
                i--; 
            }
        }
        
        // Calculate the sum of all values in the map
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        
        // Print the sum of values in the map
        System.out.println("The sum of all values in the map is: " + sum);
    }
}