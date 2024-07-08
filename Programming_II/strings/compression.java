package Programming_II.strings;

import java.util.Scanner;
public class compression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String compressedString = compressString(input);
        
        System.out.println("Compressed string: " + compressedString);
        
        scanner.close();
    }
    
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;
        
        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }
                currentChar = nextChar;
                count = 1;
            }
        }
        
        compressed.append(currentChar);
        if (count > 1) {
            compressed.append(count);
        }
        
        return compressed.toString();
    }
}