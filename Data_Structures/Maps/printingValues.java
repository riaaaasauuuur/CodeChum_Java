package Data_Structures.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class printingValues{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the number of elements in the map: ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, String> map = new LinkedHashMap<>();
        
        System.out.println("Enter the key-value pairs for the map:");
        for (int i = 0; i < numberOfElements; i++) {
            String input = scanner.nextLine();
            String[] keyValue = input.split(":");
            if (keyValue.length == 2) {
                map.put(keyValue[0], keyValue[1]);
            } else {
                System.out.println("Invalid input. Please enter in the format key:value");
                i--;
            }
        }
        
        System.out.print("The values in the map are: ");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }
}
